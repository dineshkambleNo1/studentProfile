package com.example.StudentProfile;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class StudentRepository {

    private static HashMap<String,Student> studentMap=new HashMap<String,Student>();
    public void saveStudent(Student student) {
        studentMap.put(student.getName(),student);
    }

    public Student searchStudentByName(String name) {
        return studentMap.get(name);
    }

    public Student searchStudent(int admNo) {
        return studentMap.get(admNo);
    }

    public Student searchStudentById(int id) {
        return studentMap.get(id);
    }

    public List<String> searchAllStudents() {
        return new ArrayList<>(studentMap.keySet());
    }

    //DOUBLE CHECK BRO.
    public void deleteStudentById(int id) {

        if(studentMap.containsKey(id)){
            studentMap.remove(id);
        }

        else{
            System.out.println("Student does not exists.");
        }

    }
}
