package com.example.cache.web.example;

import com.example.cache.web.example.resource.Employee;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/example")
@AllArgsConstructor
public class ExampleEmployeeController {

    private final ExampleServiceB exampleServiceB;

    @GetMapping("/employee/{employeeNumber}")
    public Employee getExample(@PathVariable String employeeNumber) {
        log.info("Calling getExample for employee number: {}", employeeNumber);
        String name = exampleServiceB.execute(employeeNumber);
        return new Employee(employeeNumber, name);
    }

}
