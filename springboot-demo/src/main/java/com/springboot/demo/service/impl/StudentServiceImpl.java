package com.springboot.demo.service.impl;

import com.springboot.demo.domain.Student;
import com.springboot.demo.mapper.StudentMapper;
import com.springboot.demo.service.StudentInitService;
import com.springboot.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;


@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentInitService studentInitService;
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public void addStudent(Student student) {
        studentMapper.insert(student);
    }

    @Override
    public Student findStudentById(int id) {
        return studentMapper.find(id);
    }

    @Override
    public List<Student> findStudentByName(String name) {
        Student student = new Student();
        student.setName(name);
        List<Student> list = new ArrayList<>();
        list = studentMapper.findAll(student);
        return list;
    }

    @Override
    public void modifyStudent(Student student) {
        studentMapper.update(student);
    }

    @Override
    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        Set<Map.Entry<String, Student>> entrySet = studentInitService.getMap().entrySet();
        for (Map.Entry<String, Student> entry : entrySet) {
            students.add(entry.getValue());
        }
        return students;
    }

}
