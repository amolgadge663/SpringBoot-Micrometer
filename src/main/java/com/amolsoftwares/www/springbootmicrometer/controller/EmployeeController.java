package com.amolsoftwares.www.springbootmicrometer.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private List<Employee> employees;

    public EmployeeController() {
        employees = new ArrayList<>();
        employees.add(new Employee(1, "John Doe", "Developer"));
        employees.add(new Employee(2, "Jane Smith", "Manager"));
        employees.add(new Employee(3, "Michael Johnson", "Tester"));
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employees;
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        throw new IllegalArgumentException("Employee not found with id: " + id);
    }

    @GetMapping("/search")
    public Employee getEmployeeByName(@RequestParam("name") String name) {
        for (Employee employee : employees) {
            if (employee.getName().equalsIgnoreCase(name)) {
                return employee;
            }
        }
        throw new IllegalArgumentException("Employee not found with name: " + name);
    }
}