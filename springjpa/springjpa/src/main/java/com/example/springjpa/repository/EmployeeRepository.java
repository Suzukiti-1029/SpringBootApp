package com.example.springjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springjpa.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
