package com.employee.management.servise;

import com.employee.management.dio.EmployeeDio;
import com.employee.management.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiseImp implements EmployeeServise{
    @Autowired
    private EmployeeDio dio ;

    @Override
    public List<Employee> getAllEmploye() {
        return dio.findAll();
    }

    @Override
    public Employee getEmployeeId(Long id) {
        return dio.findById(id).orElse(null);
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return dio.save(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        Employee exit = dio.findById(employee.getId()).orElse(null);
        exit.setId(employee.getId());
        exit.setName(employee.getName());
        exit.setSalary(employee.getSalary());
        exit.setDepartment(employee.getDepartment());
        return dio.save(exit);
    }

    @Override
    public Employee deleteEmployee(Long id) {
        return deleteEmployee(id);
    }
}
