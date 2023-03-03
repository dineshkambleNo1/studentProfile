package com.example.StudentProfile;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int admNo;

    private String name;

    private int age;

    private String fathersName;

    private String email;

    private String course;

    private String branch;

    public Student() {

    }

    public Student(int id, int admNo, String name, int age, String fathersName, String email, String course, String branch) {
        this.id = id;
        this.admNo = admNo;
        this.name = name;
        this.age = age;
        this.fathersName = fathersName;
        this.email = email;
        this.course = course;
        this.branch = branch;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAdmNo() {
        return admNo;
    }

    public void setAdmNo(int admNo) {
        this.admNo = admNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
