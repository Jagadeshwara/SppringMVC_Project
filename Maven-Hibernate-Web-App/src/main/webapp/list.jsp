<%@ page language="java" import="java.util.ArrayList, com.mycom.maven.model.Employee" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list of Employees</title>
</head>
<body align="center">

<h2>Employees that are Present in the DataBase</h2>

	<a href="add">Add Record</a>
	
	<hr>

	<%
	ArrayList<Employee> employeeList = new ArrayList<Employee>();
	employeeList = (ArrayList<Employee>)session.getAttribute("employeeList");
	%>

	<table border="1" align="center">
	
		<thead align="center">
		<tr>
			<td>Employee Id</td>
			<td>Employee Name</td>
			<td>Employee Address</td>
			<td>Employee Phone</td>
			<td>Employee Salary</td>
			<td>Action1</td>
			<td>Action2</td>
		
		</tr>
		</thead>
		<%
		for (Employee empList : employeeList) {
		%>
		<tr>
			<td align="center"><%=empList.getId()%></td>
			<td align="center"><%=empList.getEmployeeName()%></td>
			<td align="center"><%=empList.getEmployeeAddress()%></td>
			<td align="center"><%=empList.getEmployeePhone()%></td>
			<td align="center"><%=empList.getEmployeeSalary()%></td>
			<td align="center"><a href="">update</a></td>
			<td align="center"><a href="">delete</a></td>

		</tr>

		<%
		}
		%>
	</table><br>
</body>
</html>