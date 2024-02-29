package com.example.cache.web;

import com.example.cache.service.EmployeeService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class ExampleServiceA {

    private final EmployeeService employeeService;

    public void execute(String employeeNumber, String firstName, String lastName) {
        String employeeName = employeeService.getEmployeeName(employeeNumber);
        if(employeeName.equals(firstName + " " + lastName)) {
            addToNoMiddleNameListener(employeeNumber);
        }

    }

    private void addToNoMiddleNameListener(String employeeNumber) {
        log.info("Added to listener for name that doesn't have last name,  employee number: {}",
            employeeNumber);
    }
}
