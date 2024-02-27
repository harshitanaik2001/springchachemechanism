package com.csi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "EMPLOYEE")

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int empId;

    @Size(min = 5, message = "EMPNAME MUST BE ATLEAST  HAVE 3 CHARACTER")
    private String empName;

    @NotNull
    private String empAddress;

    private double empSalary;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date empDOB;

    @Column(unique = true)
    private String empPanCard;

    @Column(unique = true)
    private long empUID;

    private String empGender;

    @Column(unique = true)
    @Range(min = 1000000000, max = 9999999999L, message = "CONTACT NUMBER MUST HAVE 10 DIGIT")
    private long empContactNumber;

    @Column(unique = true)
    @Email(message = "EMAIL MUST BE VALID")
    private String empEmailId;

    @Size(min = 3, message = "PASSWORD MUST BE ATLEAST 3 VALUES")
    private String empPassword;
}
