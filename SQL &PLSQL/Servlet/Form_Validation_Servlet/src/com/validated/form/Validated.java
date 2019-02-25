package com.validated.form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Validated
 */
@WebServlet("/Validated")
public class Validated extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Validated() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		
		
		String salary=request.getParameter("gsalary");
		int newsalary=Integer.parseInt(salary);
		
		if(newsalary<180000) {
			double tax=newsalary*0;
			 double sal=newsalary-tax;
			 String name=request.getParameter("fname");
			 out.println("---------------------SALARY SLIP GENERATED SUCCESSFULLY----------------");
			 out.println("<p>NAME                       : "+name+"</p>");
				out.println("<p>TAX TO BE PAID             : Rs."+tax+"</p>");
				out.println("<p>SALARY CREDITED IN ACCOUNT : Rs."+sal+"</p>");
		}
		else if(newsalary>=180000 && newsalary<=300000) {
			double tax= (newsalary*0.1);
			double sal=newsalary-tax;
			String name=request.getParameter("fname");
			 out.println("---------------------SALARY SLIP GENERATED SUCCESSFULLY----------------");
			 out.println("<p>NAME                       : "+name+"</p>");
				out.println("<p>TAX TO BE PAID             : Rs."+tax+"</p>");
				out.println("<p>SALARY CREDITED IN ACCOUNT : Rs."+sal+"</p>");
		}
		else if(newsalary>300000 && newsalary<=500000) {
			 double tax=newsalary*0.2;
			double sal=newsalary-tax;
			String name=request.getParameter("fname");
			 out.println("---------------------SALARY SLIP GENERATED SUCCESSFULLY----------------");
				out.println("<p>NAME                       : "+name+"</p>");
				out.println("<p>TAX TO BE PAID             : Rs."+tax+"</p>");
				out.println("<p>SALARY CREDITED IN ACCOUNT : Rs."+sal+"</p>");
		}
		else {
			double tax= newsalary*0.3;
			double sal=newsalary-tax;
			String name=request.getParameter("fname");
			 out.println("---------------------SALARY SLIP GENERATED SUCCESSFULLY----------------");
			 out.println("<p>NAME                       : "+name+"</p>");
				out.println("<p>TAX TO BE PAID             : Rs."+tax+"</p>");
				out.println("<p>SALARY CREDITED IN ACCOUNT : Rs."+sal+"</p>");
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
