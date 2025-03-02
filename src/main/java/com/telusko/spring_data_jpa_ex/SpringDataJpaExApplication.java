package com.telusko.spring_data_jpa_ex;

import com.telusko.spring_data_jpa_ex.model.Student;
import com.telusko.spring_data_jpa_ex.repo.StudentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaExApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaExApplication.class, args);
		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);

		StudentRepo repo = context.getBean(StudentRepo.class);

//		s1.setRollNo(101);
//		s1.setName("Navin");
//		s1.setMarks(75);
//
//		s2.setRollNo(102);
//		s2.setName("Jith");
//		s2.setMarks(100);
//
//		s3.setRollNo(103);
//		s3.setName("Sop");
//		s3.setMarks(80);

//		Optional<Student> s = repo.findById(103);
//		System.out.println(s.orElse(new Student()));

		System.out.println(repo.findByName("Navin"));

	}

}
