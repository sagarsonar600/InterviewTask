package com.practice.restapitask.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.restapitask.dto.EmployeeDto;
import com.practice.restapitask.entity.Employee;
import com.practice.restapitask.repository.EmployeeRepository;

@Service
public class RestTaskServiceServiceImpl implements RestTaskService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee addEmployee(EmployeeDto employeeDto) {
		Employee employee = new Employee();
		BeanUtils.copyProperties(employeeDto, employee);
		System.out.println(employee);
		Employee save = employeeRepository.save(employee);
		System.out.println(save);
		return save;
	}

	@Override
	public Employee getEmployee(Integer empId) {
		return employeeRepository.findById(empId).get();
	}

	@Override
	public String removeEmployee(Integer empId) {
		employeeRepository.deleteById(empId);
		return "Employee with employee Id " + empId + " removed successfully...";
	}

	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

}
