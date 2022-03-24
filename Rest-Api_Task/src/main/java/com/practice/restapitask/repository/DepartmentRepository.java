package com.practice.restapitask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.restapitask.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
