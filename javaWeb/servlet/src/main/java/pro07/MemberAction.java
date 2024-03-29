package pro07;

import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

@WebServlet("/pro07/memberAction")
public class MemberAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
		System.out.println("init");
	}

	public void destroy() {
		System.out.println("destroy");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String type = (request.getContentType());
		MemberDAO dao = new MemberDAO();
		String command;
		String removeEmail = "";
		if ("application/json".equals(type)) {

			BufferedReader br = request.getReader();
			StringBuilder sb = new StringBuilder();
			String line = null;

			while ((line = br.readLine()) != null) {
				sb.append(line);
			}

			JSONObject jsonObj = new JSONObject(sb.toString());

			command = jsonObj.get("command").toString();
			removeEmail = jsonObj.get("email").toString();
		} else {
			command = request.getParameter("command");
		}
		System.out.println(command);
		if (command != null && command.equals("addMember")) {
			System.out.println(1);
			String _id = request.getParameter("userId");
			String _pwd = request.getParameter("userPassword");
			String _name = request.getParameter("userName");
			String _email = request.getParameter("userEmail");
			MemberVO vo = new MemberVO();
			vo.setId(_id);
			vo.setEmail(_email);
			vo.setPwd(_pwd);
			vo.setName(_name);
			dao.addMember(vo);
			response.sendRedirect("./search.html");
		} else if (command != null && command.equals("removeMember")) {
			dao.removeMember(removeEmail);
//			response.sendRedirect("./search.html");
		}
//		RequestDispatcher dis = request.getRequestDispatcher("/pro07/search.html");
//		dis.forward(request, response);
	}

}
