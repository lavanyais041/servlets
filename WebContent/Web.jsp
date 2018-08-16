<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<form action="LoginServlet">
	<center></center>
		<h1> Employees </h1>
	</center>	
		
		<h3>Add New Employee</h3>  

		<table>  
		<tr><td>Name:</td><td><input type="text" name="naame"/></td></tr>  
		<tr><td>Designation:</td><td><input type="text" name="designation"/></td></tr>  
		<tr><td>Salary:</td><td><input type="text" name="salary"/></td></tr>  
		<input type="submit" value="Save Employee"/></td></tr>  
		</table>    
		  
		 <a href="View">view employees</a>
		
		
		
	</form>	
</body>
</html>