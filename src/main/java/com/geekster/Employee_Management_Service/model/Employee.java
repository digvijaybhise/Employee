package com.geekster.Employee_Management_Service.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer employeeId;

    private String firstName;
    private String lastName;

    @Email(message = "Enter valid Employee Email")
    private String email;

    @Length(min = 10, max = 15, message = "Enter valid Number")
    private String phoneNumber;

    private String role;

    private Integer salary;
}
