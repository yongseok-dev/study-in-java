package pro06;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GuguTest
 */
@WebServlet("/pro06/guguTest2")
public class GuguTest2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init() {

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int dan = Integer.parseInt(request.getParameter("dan"));
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		out.print("<html>");
		out.print("<body>");
		out.print("<table border=1 width=800 align=center>");
		out.print("<tr align=center><td colspan=2>"+dan+"단 출력</td></tr>");
		for(int i=1; i<10; i++) {
			out.print("<tr align=center bgcolor=#"+(i%2==1?"CCCCCC":"CC00CC")+">");
			out.print("<td width=400>");
			out.print(dan+"*"+i);
			out.print("</td>");
			out.print("<td width=400>");
			out.print(dan*i);
			out.print("</td>");
			out.print("</tr>");
		}
		out.print("</table>");
		out.print("</body>");
		out.print("</html>");
	
	}

	public void destroy() {
		System.out.println("destroy() call");
	}

}
