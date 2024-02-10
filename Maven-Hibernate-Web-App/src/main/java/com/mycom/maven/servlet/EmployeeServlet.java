package com.mycom.maven.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mycom.maven.dao.EmployeeDao;
import com.mycom.maven.model.Employee;

/**
 * Servlet implementation class EmployeeServlet
 */
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmployeeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Employee> employeeList = new ArrayList<Employee>();
		EmployeeDao employeeDao = new EmployeeDao();

		HttpSession session = request.getSession();

		try {
			employeeList = employeeDao.getemployees(); // returns book list collection

		} catch (Exception excp) {
			excp.printStackTrace();
			System.out.println(excp.getMessage());
		}

		session.setAttribute("employeeList", employeeList); // collection object can be set as session

		RequestDispatcher reqDisp = (RequestDispatcher) request.getRequestDispatcher("list.jsp");
		try {
			reqDisp.forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
