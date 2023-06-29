package com.geekster.Employee_Management_Service.repository;

import com.geekster.Employee_Management_Service.model.HR;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HrRepo extends JpaRepository<HR, Integer> {
}
