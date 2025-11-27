package com.employee.management.controller;

import com.employee.management.entity.Employee;
import com.employee.management.servise.EmployeeServise;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeServise servise;
    @GetMapping
    public List<Employee> getAllEmployee()
    {
        return servise.getAllEmploye();

    }
    @GetMapping("/{id}")
    public Employee getEmployeeId(@PathVariable Long id)
    {
        return servise.getEmployeeId(id);
    }
    @PostMapping
    public Employee add(@RequestBody Employee employee)
    {
        return servise.addEmployee(employee);
    }
    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Employee employee)
    {
        return servise.updateEmployee(employee);
    }
    @DeleteMapping("/{id}")
    public Employee deleteEmployee(@PathVariable Long id)
    {
        return servise.deleteEmployee(id);
    }
}
