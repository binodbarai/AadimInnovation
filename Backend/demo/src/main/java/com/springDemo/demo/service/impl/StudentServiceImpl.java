package com.springDemo.demo.service.impl;

import com.springDemo.demo.dto.request.StudentRequest;
import com.springDemo.demo.dto.response.StudentResponse;
import com.springDemo.demo.entity.Student;
import com.springDemo.demo.repository.StudentRepository;
import com.springDemo.demo.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;
    @Override
    public StudentResponse saveStudent(StudentRequest request) {

        //getter and setter
        Student student = new Student();
        student.setName(request.getName());
        student.setAddress(request.getAddress());
        student.setCreateOn(new Date());

//         //builder
//        Student student1 = Student.builder()
//                .address(request.getAddress())
//                .name(request.getName())
//                .build();
//
//        //constructor
//        Student student2 = new Student(request);

        Student savedStudent = studentRepository.save(student);
        return  new StudentResponse(savedStudent);


    }

    @Override
    public List<StudentResponse> getAllStudents() {
        List<StudentResponse> studentResponses = new ArrayList<>();
        List<Student> students = studentRepository.findAll();
        for(Student student : students){
            studentResponses.add(new StudentResponse(student));
        }
        return studentResponses;
    }

    @Override
    public StudentResponse getById(Integer id) {
        Student student = studentRepository.getReferenceById(id);
        return new StudentResponse(student);
    }


}
