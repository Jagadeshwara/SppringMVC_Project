<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Adding a new Employee</title>
<style type="text/css">
	label{
		width:180px;
		display:inline-block;
		text-align: right;
	
	}
	form{
		background-color:pink;
		width:400px;
		padding:20px 0;
	}
	#sub{
		width:140px;
		height:30px;
		margin:20px;
		color:green;
		background-color:lightyellow;
		border:solid;
	}
	#res{
		width:140px;
		height:30px;
		color:red;
		background-color:lightmaroon;
		border:solid;
	}
</style>
</head>
<body>
<div align="center">
	
	<h2>Enter Below Specified Details for Adding new Employee to the list</h2>
		<form action="employees" method="post">
		
		<label>Employee Name : </label>
		<input type="text" name="employeeName"><br><br>
		
		<label>Employee Address : </label>
		<input type="text" name="employeeAddress"><br><br>
		
		<label>Employee Phone : </label>
		<input type="number" name="employeePhone"><br><br>
		
		<label>Employee Salary : </label>
		<input type="number" name="employeeSalary"><br><br>
		
		<input type="submit" id="sub" value="Submit">
		<input type="reset" id="res" value="Reset"><br><br>
		
		</form>
	
	</div>

</body>
</html>