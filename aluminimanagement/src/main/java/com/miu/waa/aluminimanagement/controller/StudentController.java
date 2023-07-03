package com.miu.waa.aluminimanagement.controller;

import com.miu.waa.aluminimanagement.model.StudentPerState;
import com.miu.waa.aluminimanagement.model.dto.StudentDto;
import com.miu.waa.aluminimanagement.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/students")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;
    @GetMapping
    public List<StudentDto> findAll(
            @RequestParam(required = false, defaultValue = "") String filter,
            @RequestParam(required = false, defaultValue = "") String value
    ) {
        var students = studentService.findAll(filter, value);
        return students;
    }

    @GetMapping("/perState")
    public List<StudentPerState> noOfStudentsPerState(){
        return studentService.noOfStudentsPerState();
    }


}
