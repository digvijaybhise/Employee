package com.geekster.Employee_Management_Service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HR {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer hrId;

    private String firstName;
    private String lastName;

    @Email(message = "Please enter valid Email id")
    private String hrEmail;

    @Length(min = 10, max = 10, message = "Please enter valid contact number")
    private String phoneNumber;
}
