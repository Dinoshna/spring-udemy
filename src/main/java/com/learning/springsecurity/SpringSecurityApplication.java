package com.learning.springsecurity;

import com.learning.springsecurity.controller.EmployeeController;
import com.learning.springsecurity.controller.StudentController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringSecurityApplication {
	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringSecurityApplication.class, args);
		/**
		 * application Context nothing but container which contains all the beans = objects(class) which are @Component
		 */
		StudentController emp =  context.getBean(StudentController.class);
		emp.Employee();

	}

}
