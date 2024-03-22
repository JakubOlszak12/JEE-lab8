package com.example.demo.services;

import com.example.demo.converters.StudentConverter;
import com.example.demo.converters.StudentMapper;
import com.example.demo.dtos.StudentDto;
import com.example.demo.repositories.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final StudentConverter studentConverter;
    private final StudentMapper studentMapper;
   /*
   @Override
    public List<StudentDto> getAllStudents() {
        return (List<StudentDto>) studentRepository.findAll()
                .stream()
                .map(studentConverter::convert)
                .collect(Collectors.toList());
    }
    */

    @Override
    public List<StudentDto> getAllNoAttachment(){
        return studentRepository.findAllNoAttachment();
    }

    @Override
    public List<StudentDto> getAllStudents(){
        return studentRepository.findAll().stream().map(studentMapper::studentToStudentDto)
                .collect(Collectors.toList());
    }

}
