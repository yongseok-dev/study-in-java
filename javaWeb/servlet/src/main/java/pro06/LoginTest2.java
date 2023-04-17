package pro06;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginTest
 */
@WebServlet(urlPatterns = { "/pro06/loginTest2" })
public class LoginTest2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init() {
		System.out.println("init() call");
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		res.setContentType("text/html;charset=utf-8");
		PrintWriter out = res.getWriter();
		String id = req.getParameter("user_id");
		String pw = req.getParameter("user_pw");

		System.out.println("user id: " + id);
		System.out.println("user pw: " + pw);

		String innerHTML = "";
		if (id != null && (id.length() != 0)) {
			if (id.equals("admin")) {
				innerHTML = "<font size='12'>관리자로 로그인</font><br>";
				innerHTML+= "<input type=button value='회원정보 수정하기'>";
				innerHTML+= "<input type=button value='회원정보 삭제하기'>";

			} else {
				innerHTML = id + "님!! 로그인";
			}
		} else {
			innerHTML = "아이디를 입력하세요!!!!";
			innerHTML += "<br><a href='./login.html'>로그인 이동</a>";
		}
		//페이지 HTML 생성
		out.print("<html>");
		out.print("<body>");
		out.print(innerHTML);
		out.print("</body>");
		out.print("</html>");
	}

	public void destroy() {
		System.out.println("destroy() call");
	}

}
