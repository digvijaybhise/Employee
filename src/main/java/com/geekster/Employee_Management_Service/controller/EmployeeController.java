package com.geekster.Employee_Management_Service.controller;

import com.geekster.Employee_Management_Service.model.Employee;
import com.geekster.Employee_Management_Service.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping
    public String addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable Integer id){
        return employeeService.getEmployee(id);
    }

    @PutMapping("/{id}")
    public String updateEmployee(@PathVariable Integer id, @RequestBody Employee employee){
        return employeeService.updateEmployee(id, employee);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Integer id){
        employeeService.deleteEmployee(id);
    }
}
