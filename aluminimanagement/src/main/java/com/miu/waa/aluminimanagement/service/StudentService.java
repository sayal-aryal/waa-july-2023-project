package com.miu.waa.aluminimanagement.service;

import com.miu.waa.aluminimanagement.model.StudentPerState;
import com.miu.waa.aluminimanagement.model.dto.StudentDto;

import java.util.List;

public interface StudentService {

    List<StudentDto> findAll(String filter, String value);

    List<StudentPerState> noOfStudentsPerState();
}
