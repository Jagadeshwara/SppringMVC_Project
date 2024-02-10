package com.mycom.maven.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mycom.maven.dao.EmployeeDao;
import com.mycom.maven.model.Employee;

/**
 * Servlet implementation class AddEmpServlet
 */
public class AddEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Employee employee = new Employee();

		
		//id = Integer.parseInt(request.getParameter("id"));
		String employeeName = request.getParameter("employeeName");
		String employeeAddress = request.getParameter("employeeAddress");
		String employeePhone = request.getParameter("employeePhone");
		String employeeSalary = request.getParameter("employeeSalary");

		//employee.setId(id);
		employee.setEmployeeName(employeeName);
		employee.setEmployeeAddress(employeeAddress);
		employee.setEmployeePhone(employeePhone);
		employee.setEmployeeSalary(employeeSalary);

		EmployeeDao emplDao = new EmployeeDao();

		try {
			int rowCount = emplDao.insertEmployee(employee);
			
			
		} catch (Exception excp) {
			excp.printStackTrace();
			System.out.println(excp.getMessage());
		}

		// collection object can be set as session

		RequestDispatcher reqDisp = request.getRequestDispatcher("/add.jsp");
		reqDisp.forward(request, response);
	}

}
