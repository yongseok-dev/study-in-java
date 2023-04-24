package pro08;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pro08/PageOut")
public class PageOut extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("page out start"+request);
		response.getWriter().println("page out start");
		
		//8-14,8-16 request 객체는 요청마다 초기화된다. -> redirect는 null, dispatch는 값을 받아옴
//		String address = (String)request.getAttribute("address");
//		response.getWriter().println(address);
		
		//8-22
		ServletContext context = getServletContext();
		String txt = context.getInitParameter("contextParam");
		System.out.println(txt);
		response.getWriter().println(txt);
		
		System.out.println("page out end");
		response.getWriter().println("page out end");
	}
}
