
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ThirdServlet
 */
@WebServlet("/ThirdServlet")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ThirdServlet() {
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
			String name = request.getParameter("lastname");
			String fname = request.getParameter("firstname");
			String qua = request.getParameter("qualification");
			
			Cookie ck1 = new Cookie("qualification", qua);
			response.addCookie(ck1);
			
			Cookie ck[] = request.getCookies();
			for(int i=0;i<ck.length;i++){  
				 out.print("<br>"+ck[i].getValue());  
				}

			out.print("<br>"+qua);
			out.println("<br>" + "<form action='FourthServlet'>");
			out.println("<br>" + "Marks" + "<input type='number' name='mark'/>");
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
