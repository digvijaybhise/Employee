package com.geekster.Employee_Management_Service.service;

import com.geekster.Employee_Management_Service.model.Employee;
import com.geekster.Employee_Management_Service.model.HR;
import com.geekster.Employee_Management_Service.repository.EmployeeRepo;
import com.geekster.Employee_Management_Service.repository.HrRepo;
import jakarta.transaction.Transactional;
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

    @Transactional
    public String updateHr(Integer id, HR hr) {
        if(!hrRepo.existsById(id)) return "HR is not present in Database.";
        hrRepo.save(hr);
        return "HR updated successfully..!!!";
    }

    @Transactional
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
