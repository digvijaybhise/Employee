package com.geekster.Employee_Management_Service.repository;

import com.geekster.Employee_Management_Service.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
}
