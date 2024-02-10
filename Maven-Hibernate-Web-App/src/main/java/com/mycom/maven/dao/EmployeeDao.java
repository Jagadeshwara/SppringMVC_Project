package com.mycom.maven.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.mycom.maven.model.Employee;

@Repository
public class EmployeeDao {

	List<Employee> employeeList = new ArrayList<Employee>();
	Session session;
	Transaction trans;

	public ArrayList<Employee> getemployees() {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		session = sessionFactory.openSession();
		trans = session.beginTransaction();
		// Employee emp = session.get(Employee.class, 102);
		Query query = session.createQuery("from Employee");
		List<Employee> list = query.list();

		for (Employee emp : list) {

			emp.getId();
			emp.getEmployeeName();
			emp.getEmployeeAddress();
			emp.getEmployeePhone();
			emp.getEmployeeSalary();

		}
//			  while(list != null) {
//				  int id;
//				  String employeeName;
//				  String employeeAddress;
//				  long employeePhone;
//				  String employeeSalary;
//				  
//				  Employee emp = new Employee();
//				  id = emp.getId();
//				  employeeName = emp.getEmployeeName();
//				  employeeAddress = emp.getEmployeeAddress();
//				  employeePhone = emp.getEmployeePhone();
//				  employeeSalary = emp.getEmployeeSalary();
//				  
//				  emp.setId(id);
//				  emp.setEmployeeName(employeeName);
//				  emp.setEmployeeAddress(employeeAddress);
//				  emp.setEmployeePhone(employeePhone);
//				  emp.setEmployeeSalary(employeeSalary);
//				  
//				  list.add(emp);
//			  }
		return (ArrayList<Employee>) employeeList;
	}

	public int insertEmployee(Employee employee) {

		int rowCount = 0;

		Employee emp = new Employee();
		emp.setEmployeeName(employee.getEmployeeName());
		emp.setEmployeeAddress(employee.getEmployeeAddress());
		emp.setEmployeePhone(employee.getEmployeePhone());
		emp.setEmployeeSalary(employee.getEmployeeSalary());
		session.persist(emp);
		trans.commit();
		return rowCount;
	}

}
