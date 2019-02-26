
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FourthServlet")
public class FourthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public FourthServlet() {
		super();
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			String mark = request.getParameter("mark");
			int mak=Integer.parseInt(mark);
			String name = request.getParameter("lastname");
			String fname = request.getParameter("firstname");
			String qua = request.getParameter("qualification");
			

			Cookie ck[] = request.getCookies();
			for(int i=0;i<ck.length;i++){  
				 out.print("<br>"+ck[i].getValue());  
				}
			out.println("<br>" + mak);
			

		} catch (Exception e) {
			System.out.println("Error Occured : " + e);
		}

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
