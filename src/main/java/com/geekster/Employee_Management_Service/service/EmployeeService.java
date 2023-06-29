package com.geekster.Employee_Management_Service.service;

import com.geekster.Employee_Management_Service.model.Employee;
import com.geekster.Employee_Management_Service.repository.EmployeeRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    public String addEmployee(Employee employee) {
        employee.setSalary(0);
        employee.setRole("");
        employeeRepo.save(employee);
        return "Employee saved Successfully..!!!";
    }

    public Employee getEmployee(Integer id) {
        return employeeRepo.findById(id).get();
    }


    @Transactional
    public String updateEmployee(Integer id, Employee employee) {
        Employee oldInfo = employeeRepo.findById(id).get();
        if(oldInfo == null) return "Employee is not present in Database";
        employee.setRole(oldInfo.getRole());
        employee.setSalary(oldInfo.getSalary());

        employeeRepo.save(employee);

        return "Employee updated Successfully..!!!";
    }

    public void deleteEmployee(Integer id) {
        employeeRepo.deleteById(id);
    }
}
