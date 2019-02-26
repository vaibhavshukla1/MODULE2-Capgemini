
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SecondServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			String name1 = request.getParameter("lastname");
			String fname = request.getParameter("firstname");
			
			Cookie ck1 = new Cookie("lastname", name1);
			response.addCookie(ck1);
			
			Cookie ck[] = request.getCookies();
			for(int i=0;i<ck.length;i++){  
				 out.print("<br>"+ck[i].getValue());  
				} 
			
			out.println("<br>" + name1);

			out.println("<br>" + "<form action='ThirdServlet'>");
			out.println("<br>" + "Qualification" + "<input type='text' name='qualification'/>");
			out.println("<br>" + "<button type='submit' name='submit'>Submit</button>");
			out.println("<br>" + "</form>");
		} catch (Exception e) {
			System.out.println("Error Occured : " + e);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
