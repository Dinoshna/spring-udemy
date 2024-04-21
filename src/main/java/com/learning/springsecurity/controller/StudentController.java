package com.learning.springsecurity.controller;

import com.learning.springsecurity.model.ExpenseDetails;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
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

}
