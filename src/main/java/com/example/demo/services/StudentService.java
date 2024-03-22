package com.example.demo.services;

import com.example.demo.dtos.StudentDto;

import java.util.List;

public interface StudentService {
    List<StudentDto> getAllStudents();
    List<StudentDto> getAllNoAttachment();
}
