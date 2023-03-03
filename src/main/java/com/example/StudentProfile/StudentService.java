package com.example.StudentProfile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public void addStudent(Student student) {
        Student student1 = Student.builder()
                .admNo(student.getAdmNo())
                  .age(student.getAge())
                    .branch(student.getBranch())
                     .course(student.getCourse())
                     .email(student.getEmail()).fathersName(student.getFathersName()).build();

        studentRepository.save(student);
    }


    public Student getStudentById(int id) {
        return studentRepository.findById(id).get();
    }

    public List<String> getAllStudents() {
        List<Student> students = studentRepository.findAll();

        List<String > listOfNames = new ArrayList<>();

        for(Student student : students){

            listOfNames.add(student.getName());

        }

        return listOfNames;

    }

    public void deleteStudentById(int id) {
        studentRepository.deleteById(id);
    }



    public Student updateStudentDetails(Student student) {

        return studentRepository.save(student);
    }
}
