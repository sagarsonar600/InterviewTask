package com.practice.restapitask.service;

import java.util.List;

import com.practice.restapitask.dto.EmployeeDto;
import com.practice.restapitask.entity.Employee;

public interface RestTaskService {

	Employee addEmployee(EmployeeDto employeeDto);

	Employee getEmployee(Integer empId);

	String removeEmployee(Integer empId);

	List<Employee> getAllEmployee();

}
