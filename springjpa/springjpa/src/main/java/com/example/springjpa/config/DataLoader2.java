package com.example.springjpa.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.springjpa.model.Department;
import com.example.springjpa.repository.DepartmentRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class DataLoader2 implements CommandLineRunner {
  private final DepartmentRepository repository;

  @Override
  public void run(String... args) throws Exception {
    Department department = new Department();
    department.setName("営業");
    repository.save(department);

    department = new Department();
    department.setName("開発");
    repository.save(department);
  }
}
