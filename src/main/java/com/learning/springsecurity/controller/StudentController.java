package com.learning.springsecurity.controller;

import com.learning.springsecurity.model.ExpenseDetails;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@Component
public class StudentController {

    /**
     * Dependency Injection -Injecting objects into Container
     */
    @Autowired
    EmployeeController empRef;

    List<ExpenseDetails> details = new ArrayList<>(List.of(
            new ExpenseDetails(1, "shopping"),
            new ExpenseDetails(2, "food")));

    @GetMapping("csrf-token")
    public CsrfToken generateCsrfToken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @GetMapping("/expense-details")
    public List<ExpenseDetails> getExpenseDetails() {
        return details;

    }

    public void Employee() {
        System.out.println("employee from student");
        empRef.employeeDetails();
    }

}
