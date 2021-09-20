package com.emirexco.studentmanagementsystem;



import com.emirexco.studentmanagementsystem.entity.Student;
import com.emirexco.studentmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.emirexco.studentmanagementsystem.entity.Class.*;
import static com.emirexco.studentmanagementsystem.entity.Gender.FEMALE;
import static com.emirexco.studentmanagementsystem.entity.Gender.MALE;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementSystemApplication.class, args);
    }

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
        Student james = new Student("James", "Ogbonna", MALE, "jamesO@gmail.com", false, SSS2);
        studentRepository.save(james);

        Student ifeoma = new Student("Ifeoma", "Julius", FEMALE, "ifeomaJ@gamil.com", true, JSS3);
        studentRepository.save(ifeoma);

        Student michael = new Student("Michael", "Smith", MALE, "msmith@gmail.com", true, SSS3);
        studentRepository.save(michael);

        Student ifeoluwa = new Student("Ifeoluwa", "Adeola", FEMALE, "ifeade@gmail.com", false, SSS1);
        studentRepository.save(ifeoluwa);

        Student ahmed = new Student("Ahmed", "Gobir", MALE, "ahmedgobir@gmail.com", true, JSS1);
        studentRepository.save(ahmed);
    }
}
