package com.springDemo.demo.entity;

import com.springDemo.demo.dto.request.StudentRequest;
import com.springDemo.demo.dto.response.StudentResponse;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "stu")
@Builder
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "stu_name")
    private String name;

    @Column(name = "stu_address")
    private String address;
    private Date createOn;


    public Student(StudentResponse request) {
        this.name = request.getName();
        this.address = request.getAddress();
    }
}
