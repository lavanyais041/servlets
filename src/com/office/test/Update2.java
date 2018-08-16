package com.office.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Update2
 */
public class Update2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Update2() {
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
        
        out.println("<h1>Update Employee</h1>");
        
        String si=request.getParameter("id");  
        int id = Integer.parseInt(si);  
          
        System.out.println(id);
        
        UserBean user = Dao.getEmployeeById(id); 
        System.out.println(user);
          
        out.print("<form action='Update' method='post'>");  
        out.print("<table>");  
        out.print("<tr><td></td><td><input type='hidden' name='id' value='"+user.getId()+"'/></td></tr>");  
        out.print("<tr><td>naame:</td><td><input type='text' name='naame' value='"+user.getNaame()+"'/></td></tr>");  
        out.print("<tr><td>designation:</td><td><input type='text' name='designation' value='"+user.getDesignation()+"'/></td></tr>");  
        out.print("<tr><td>salary:</td><td><input type='text' name='salary' value='"+user.getSalary()+"'/></td></tr>");  
      
        out.print("<tr><td colspan='2'><input type='submit' value='Edit & Save '/></td></tr>");  
        out.print("</table>");  
        out.print("</form>");  
         
        
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
