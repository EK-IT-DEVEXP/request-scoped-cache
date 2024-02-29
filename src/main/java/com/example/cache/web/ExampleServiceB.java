package com.example.cache.web;

import com.example.cache.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ExampleServiceB {

    private final ExampleServiceA serviceA;
    private final EmployeeService employeeService;

    public String execute(String employeeNumber) {
        String name = employeeService.getEmployeeName(employeeNumber);
        String names[] = name.split(" ");
        if(names.length > 1) {
            serviceA.execute(employeeNumber, names[0], names[names.length - 1]);
        }
        return name;
    }
}
