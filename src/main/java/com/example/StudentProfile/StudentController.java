package com.example.StudentProfile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {


    @Autowired
    StudentService studentService;


    @PostMapping("/add-student")
    public ResponseEntity<String> addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return new ResponseEntity<>("New student added successfully", HttpStatus.CREATED);
    }

    @GetMapping("/get-student-by-id/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable int id){
        Student student = null;
        student = studentService.getStudentById(id);
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }

    @GetMapping("/get-student-by-name/{name}")
    public ResponseEntity<Student> getStudentByName(@PathVariable String name){
        Student student = null;
        student = studentService.getStudentByName(name);
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }

    @GetMapping("/get-student-by-admNo/{admNo}")
    public ResponseEntity<Student> getStudentByAdmNo(@PathVariable int admNo){
        Student student = null;
       student = studentService.getStudentByAdmNo(admNo);
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }


    @GetMapping("/get-all-students")
    public ResponseEntity<List<String>> getAllStudents(){
        List<String> students = null; // Assign list of student by calling service layer method
        students = studentService.getAllStudents();
        return new ResponseEntity<>(students, HttpStatus.CREATED);
    }

    //get student grouped by course

    //get student grouped by branch

    // update


    //or delete

    @DeleteMapping("/delete-student-by-id")
    public ResponseEntity<String> deleteStudentById(@RequestParam int id){
        studentService.deleteStudentById(id);
        return new ResponseEntity<>(id+ " removed successfully", HttpStatus.CREATED);
    }

}
