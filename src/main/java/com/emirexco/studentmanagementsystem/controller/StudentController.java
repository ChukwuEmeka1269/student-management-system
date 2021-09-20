package com.emirexco.studentmanagementsystem.controller;

import com.emirexco.studentmanagementsystem.entity.Student;
import com.emirexco.studentmanagementsystem.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    //creating the handler method to handle list of students and return model and view
    @GetMapping("/students")
    public String listAllStudents(Model model){
        model.addAttribute("students", studentService.getAllStudent());
        return "students";

    }

    @GetMapping("/students/new")
    public String createNewStudent(Model model){
        Student student = new Student();
        model.addAttribute("student", student);
        return "create_student";
    }

    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student){
        studentService.save(student);
        return "redirect:/students";
    }

    @GetMapping("/students/edit/{id}")
    public String editStudent(@PathVariable Long id, Model model){
        model.addAttribute("student", studentService.getStudentById(id));
        return "edit_student";
    }

    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable Long id,
                                @ModelAttribute("Student") Student student,
                                Model model){

        Student studentInDB = studentService.getStudentById(id);

        studentInDB.setFirstName(student.getFirstName());
        studentInDB.setLastName(student.getLastName());
        studentInDB.setEmail(student.getEmail());
        studentInDB.setGender(student.getGender());
        studentInDB.setHasPaidFees(student.getHasPaidFees());
        studentInDB.setForm(student.getForm());

        studentService.updateStudent(studentInDB);

        return "redirect:/students";

    }


    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable Long id){
        studentService.deleteStudentById(id);
        return "redirect:/students";
    }
}
