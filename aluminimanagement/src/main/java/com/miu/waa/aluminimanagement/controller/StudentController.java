package com.miu.waa.aluminimanagement.controller;

import com.miu.waa.aluminimanagement.service.StudentServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {

    private  final StudentServiceImpl studentService;



}
