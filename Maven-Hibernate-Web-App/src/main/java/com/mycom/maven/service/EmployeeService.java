package com.mycom.maven.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycom.maven.dao.EmployeeDao;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao employeeDao;
	
	public void addEmployee() {
		employeeDao.getemployees();
	}

}
