package com.geekster.Employee_Management_Service.service;

import com.geekster.Employee_Management_Service.model.Employee;
import com.geekster.Employee_Management_Service.model.HR;
import com.geekster.Employee_Management_Service.repository.EmployeeRepo;
import com.geekster.Employee_Management_Service.repository.HrRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HrService {

    @Autowired
    EmployeeRepo employeeRepo;

    @Autowired
    HrRepo hrRepo;

    public List<Employee> getAllEmployee() {
        return employeeRepo.findAll();
    }

    public String addHr(HR hr) {
        hrRepo.save(hr);
        return "HR saved successfully..!!!";
    }

    public String updateHr(HR hr) {
        hrRepo.save(hr);
        return "HR updated successfully..!!!";
    }

    public String updateEmployee(Integer id, Integer salary, String role) {
        Employee employee = employeeRepo.findById(id).get();
        employee.setSalary(salary);
        employee.setRole(role);
        employeeRepo.save(employee);
        return "Salary & role gets updated...!!!";
    }

    public void deleteHr(Integer id) {
        hrRepo.deleteById(id);
    }

    public HR getById(Integer id) {
        return hrRepo.findById(id).get();
    }
}
