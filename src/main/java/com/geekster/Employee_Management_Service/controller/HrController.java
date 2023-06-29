package com.geekster.Employee_Management_Service.controller;

import com.geekster.Employee_Management_Service.model.Employee;
import com.geekster.Employee_Management_Service.model.HR;
import com.geekster.Employee_Management_Service.service.HrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hr")
public class HrController {

    @Autowired
    HrService hrService;

    @PostMapping
    public String addHr(@RequestBody HR hr){
        return hrService.addHr(hr);
    }

    @GetMapping("/{id}")
    public HR getById(@PathVariable Integer id){
        return hrService.getById(id);
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployee(){
        return hrService.getAllEmployee();
    }

    @PutMapping
    public String updateHr(@RequestBody HR hr){
        return hrService.updateHr(hr);
    }

    @PutMapping("/employee/{id}/{salary}/{role}")
    public String updateEmployee(@PathVariable Integer id , @PathVariable Integer salary, @PathVariable String role){
        return hrService.updateEmployee(id, salary, role);
    }

    @DeleteMapping("/{id}")
    public void deleteHr(@PathVariable Integer id){
        hrService.deleteHr(id);
    }
}
