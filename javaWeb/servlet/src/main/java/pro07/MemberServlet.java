package pro07;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;

@WebServlet("/pro07/member")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
		System.out.println("init");
	}

	public void destroy() {
		System.out.println("destroy");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();

		String keyWord = request.getParameter("keyword");

		MemberDAO dao = new MemberDAO();
		List<MemberVO> list = dao.listMembers(keyWord);

		String type = request.getParameter("type");
		if ("json".equals(type)) {
			JSONArray json = new JSONArray(list);
			out.print(json.toString());
		} else {

			String innerHTML = "";

			for (int i = 0; i < list.size(); i++) {
				MemberVO memberVO = list.get(i);
				String id = memberVO.getId();
				String pwd = memberVO.getPwd();
				String name = memberVO.getName();
				String email = memberVO.getEmail();
				Date joinDate = memberVO.getJoinDate();
				innerHTML += "<tr><td>" + id + "</td><td>" + pwd + "</td><td>" + name + "</td><td>" + email
						+ "</td><td>" + joinDate + "</td><td></tr>";
			}

			out.print("<html><body>");
			out.print("<table border=1>");
			out.print("<tr>");
			out.print("<th>아이디</th>");
			out.print("<th>비밀번호</th>");
			out.print("<th>이름</th>");
			out.print("<th>이메일</th>");
			out.print("<th>가입일</th>");
			out.print("</tr>");
			out.print(innerHTML);
			out.print("</table>");
			out.print("</body></html>");

		}
	}

}
