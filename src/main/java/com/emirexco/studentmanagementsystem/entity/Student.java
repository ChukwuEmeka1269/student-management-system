package com.emirexco.studentmanagementsystem.entity;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Enumerated(EnumType.STRING)
    @Column(name= "gender")
    private Gender gender;

    @Column(name = "email")
    private String email;



    @Column(name = "hasPaidFees")
    private Boolean hasPaidFees;

    @Column(name="form")
    private Class form;

    public Student() {
    }

    public Student(String firstName, String lastName, Gender gender, String email, Boolean hasPaidFees, Class form) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.hasPaidFees = hasPaidFees;
        this.form = form;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getHasPaidFees() {
        return hasPaidFees;
    }

    public void setHasPaidFees(Boolean hasPaidFees) {
        this.hasPaidFees = hasPaidFees;
    }

    public Class getForm() {
        return form;
    }

    public void setForm(Class form) {
        this.form = form;
    }
}
