package com.handi.demoapp.service;

import com.handi.demoapp.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> listAll();
    public Student get(Integer id);
    public void delete(Integer id);
}
