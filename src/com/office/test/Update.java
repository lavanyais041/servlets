package com.office.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Update
 */
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Update() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		 response.setContentType("text/html");  
	        PrintWriter out=response.getWriter();  
	         
	        String si = request.getParameter("id");  
	        int id = Integer.parseInt(si);
	        
	        UserBean user = new UserBean(); 
	         
	        String name=request.getParameter("naame");  
	        String desig=request.getParameter("designation");  
	        String sal=request.getParameter("salary");  
	         
	         user.setId(id);  
	         user.setNaame(name);  
			 user.setDesignation(desig);  
			 user.setSalary(sal);  
			 
			 System.out.println(user);
	          
	        int status = Dao.update(user);  
	        if(status>0)
	        {  
	            response.sendRedirect("View");  
	        }
	        else
	        {  
	            out.println("Sorry! unable to update record");  
	        }  
	          
	        out.close();  
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
