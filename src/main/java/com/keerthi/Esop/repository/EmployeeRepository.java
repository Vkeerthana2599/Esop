package com.keerthi.Esop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.keerthi.Esop.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
