package com.office.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

/**
 * Servlet implementation class View
 */
//@WebServlet("/View") 
public class View extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	
    public View() {
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
        
        out.println("<a href='Web.jsp'>Add New Employee</a>");  
        out.println("<h1>Employees List</h1>");  
          
        List<UserBean> list = Dao.getAllEmployees();
        
        out.print("<table border='1' width='100%'");  
        out.print("<tr><th>id</th><th>naame</th><th>designation</th><th>salary</th><th>edit</th><th>delete</th></tr>");  
        
        for(UserBean use : list)
        {  
        	out.print("<tr><td>"+use.getId()+"</td><td>"+use.getNaame()+"</td><td>"+use.getDesignation()+"</td><td>"+use.getSalary()+"</td><td><a href='Update2?id="+use.getId()+"'>edit</a></td><td><a href='Delete?id="+use.getId()+"'>delete</a></td></tr>");  
              System.out.println(use);
        }  
        out.print("</table>");  
          
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
