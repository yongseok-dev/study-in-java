package pro08;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pro08/PageIn")
public class PageIn extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("page in start"+request);
		response.getWriter().println("page in start");
		response.addHeader("check", "1;"); // redirect 담김
		
		//8-13 setAttribute는 요청 객체에 key:value로 저장하는 저장소 요청 객체가 살아있는 동안 활용된다.
//		request.setAttribute("address","서울시 용산구");
		//session
		request.getSession();
		
		//8-1 redirect 시 page in 응답 데이터를 로드하지 못함
		response.sendRedirect("PageOut");
		
		//8-3 refresh -> 페이지 이동
//		response.addHeader("refresh", "1;url=PageOut");
		
		//8-5 location -> 페이지 이동
//		response.setContentType("text/html");
//		response.getWriter().print("<html><script>location.href='PageOut'</script></html>");
		
		//8.3 dispatch
//		RequestDispatcher dispatch = request.getRequestDispatcher("PageOut");
//		dispatch.forward(request, response);
		
		response.addHeader("check", "2;"); // 찍히지 않음
		response.getWriter().println("page in end");		
		System.out.println("page in end");
	}
}
