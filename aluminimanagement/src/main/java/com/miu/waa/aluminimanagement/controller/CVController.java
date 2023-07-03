package com.miu.waa.aluminimanagement.controller;

import com.miu.waa.aluminimanagement.model.dto.CVDto;
import com.miu.waa.aluminimanagement.service.CVService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/cvs")
public class CVController {
    private final CVService cvService;
    @GetMapping
    public List<CVDto> getAllCvs(){
        return cvService.findAll();
    }

}



