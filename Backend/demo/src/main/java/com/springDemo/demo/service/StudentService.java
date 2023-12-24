package com.springDemo.demo.service;


import com.springDemo.demo.dto.request.StudentRequest;
import com.springDemo.demo.dto.response.StudentResponse;
import com.springDemo.demo.entity.Student;

import java.util.List;

public interface StudentService {
    StudentResponse saveStudent(StudentRequest request);
    List<StudentResponse> getAllStudents();

    StudentResponse getById(Integer id);

    StudentResponse updateStudent(StudentUpdateRequest request);



}
