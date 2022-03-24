package com.practice.restapitask.dto;

import java.util.List;

import com.practice.restapitask.entity.Department;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {
	private int employeeId;
	private String employeeName;
	private String state;
	private String city;
	private String phoneNumber;
	private List<Department> departments;
}
