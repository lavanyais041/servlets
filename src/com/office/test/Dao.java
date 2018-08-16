package com.office.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Dao {
	
	 public static Connection getConnection()
	 {
		 
		 Connection con = null;
			
		     try{  
		 		Class.forName("com.mysql.jdbc.Driver");  
		 		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","root"); 
		 		System.out.println("connected successfully");
		 		
		 		}
		     
		     catch(Exception ex)
		     {
				ex.printStackTrace();	
		     }  
			
		     return con;
	}
	
	 public static int save(UserBean user)
	 {
		 int i = 0;
			
		 try{  
	            Connection con = Dao.getConnection(); 
		 
	            PreparedStatement ps=con.prepareStatement("insert into Emp(naame,designation,salary) values (?,?,?)");  
			    ps.setString(1,user.getNaame());  
			    ps.setString(2,user.getDesignation());  
			    ps.setString(3,user.getSalary());  
			    System.out.println(ps);
			    i = ps.executeUpdate();  
			    
		 	}
		 
		 catch(Exception ex)
		 {
			 ex.printStackTrace();  
		 }
     
	 		return i; 
	 }
		 


	public static List getAllEmployees()
	{
		
		List<UserBean> list=new ArrayList();
		
		try{  
            Connection con = Dao.getConnection(); 
            PreparedStatement ps = con.prepareStatement("select * from Emp");  
            ResultSet rs = ps.executeQuery();  
            while(rs.next())  
            {  
               
            	UserBean user = new UserBean();
            	user.setId(rs.getInt(1));  
                user.setNaame(rs.getString(2));  
                user.setDesignation(rs.getString(3));  
                user.setSalary(rs.getString(4));  
                 
                list.add(user); 
                System.out.println(list);
            }  
		
            con.close();  
        }
		catch(Exception e)
		{
			e.printStackTrace();
		}  
          
        return list; 
	}
	
	
	 public static int update(UserBean user)
	 {  
	        int status = 0;  
	        try
	        {  
	            Connection con = Dao.getConnection();  
	            PreparedStatement ps = con.prepareStatement("update Emp set naame=?,designation=?,salary=? where id=?");  
	            ps.setString(1,user.getNaame());  
	            ps.setString(2,user.getDesignation());  
	            ps.setString(3,user.getSalary());  
	            ps.setInt(4,user.getId());  
	              
	            status = ps.executeUpdate();  
	            
	            
	            con.close();  
	        }
	        catch(Exception ex)
	        {
	        	ex.printStackTrace();
	        }  
	          
	        return status;  
	    }  
	 
	 
	 public static UserBean getEmployeeById(int id)
	 {  
	        UserBean user = new UserBean();
	          
	        try
	        {  
	            Connection con = Dao.getConnection();  
	            PreparedStatement ps=con.prepareStatement("select * from Emp where id=?");  
	            ps.setInt(1,id);  
	            ResultSet rs=ps.executeQuery();  
	            if(rs.next())
	            {  
	                user.setId(rs.getInt(1));  
	                user.setNaame(rs.getString(2));  
	                user.setDesignation(rs.getString(3));  
	                user.setSalary(rs.getString(4));  
	                
	            }  
	            
	            System.out.println(user);
	            con.close();  
	        }
	        catch(Exception ex)
	        {
	        	ex.printStackTrace();
	        	}  
	          
	        return user;  
	    }  
		
	 public static int delete(int id)
	 {  
	        int status=0;  
	        try{  
	            Connection con = Dao.getConnection();  
	            PreparedStatement ps=con.prepareStatement("delete from Emp where id=?");  
	            ps.setInt(1,id);  
	            status=ps.executeUpdate();  
	              
	            con.close();  
	        }
	        
	        catch(Exception e)
	        {
	        	e.printStackTrace();
	        }  
	        
	          
	        return status;
	 }
	}

