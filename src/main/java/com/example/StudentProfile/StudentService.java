package com.example.StudentProfile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public void addStudent(Student student) {
        studentRepository.saveStudent(student);
    }

    public Student getStudentByName(String name) {
        return  studentRepository.searchStudentByName(name);
    }

    public Student getStudentByAdmNo(int admNo) {
        return studentRepository.searchStudent(admNo);
    }

    public Student getStudentById(int id) {
        return studentRepository.searchStudentById(id);
    }

    public List<String> getAllStudents() {
        return studentRepository.searchAllStudents();
    }

    public void deleteStudentById(int id) {
        studentRepository.deleteStudentById(id);
    }

//    public Student getStudent(int admNo) {
//        return studentRepository.searchStudent(admNo);
//    }
}
