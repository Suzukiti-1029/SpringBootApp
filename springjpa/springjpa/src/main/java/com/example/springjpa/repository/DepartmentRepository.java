package com.example.springjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springjpa.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
