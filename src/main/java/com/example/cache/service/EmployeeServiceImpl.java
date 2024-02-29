package com.example.cache.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Service
public class EmployeeServiceImpl implements EmployeeService {

    private static final Map<String, String> EMPLOYEE_NAME_BY_NUMBER = new HashMap<>();

    static {
        EMPLOYEE_NAME_BY_NUMBER.put("486515", "Vivek Adhikari");
    }

    @Override
    @Cacheable("employeeName")
    public String getEmployeeName(String employeeNumber) {
        log.info("Calling database to get employee name for employee number: {} ", employeeNumber);
        return EMPLOYEE_NAME_BY_NUMBER.getOrDefault(employeeNumber, "Unknown");
    }
}
