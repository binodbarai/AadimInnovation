package com.springDemo.demo.controller;

import com.springDemo.demo.dto.request.StudentRequest;
import com.springDemo.demo.dto.response.StudentResponse;
import com.springDemo.demo.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @PostMapping("/save")
    public StudentResponse save(@RequestBody StudentRequest request){
        return studentService.saveStudent(request);
    }

    @GetMapping("/fetch")
    public List<StudentResponse> getAll(){
        return studentService.getAllStudents();
    }

    @GetMapping("/fetch/{id}")
    public StudentResponse getById(@PathVariable Integer id){
        return studentService.getById(id);
    }
}
