package com.example.StudentProfile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {


    @Autowired
    StudentService studentService;


    // for creating new student
    @PostMapping("/add-student")
    public ResponseEntity<String> addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return new ResponseEntity<>("New student added successfully", HttpStatus.CREATED);
    }

    // find  the student by id
    @GetMapping("/get-student-by-id")
    public ResponseEntity<Student> getStudentById(@RequestParam("id") int id){
        Student student = null;
        student = studentService.getStudentById(id);
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }

    // get all the  students
    @GetMapping("/get-all-students")
    public ResponseEntity<List<String>> getAllStudents(){
        List<String> students = null; // Assign list of student by calling service layer method
        students = studentService.getAllStudents();
        return new ResponseEntity<>(students, HttpStatus.CREATED);
    }

    // update

    @PutMapping("/update-student-details")
    public Student updateStudentDetails(@RequestBody Student student,@RequestParam("id") int id){
        return studentService.updateStudentDetails(student);
    }

    // delete the student by id
    @DeleteMapping("/delete-student-by-id")
    public ResponseEntity<String> deleteStudentById(@RequestParam("id") int id){
        studentService.deleteStudentById(id);
        return new ResponseEntity<>(id+ " removed successfully", HttpStatus.CREATED);
    }

}
