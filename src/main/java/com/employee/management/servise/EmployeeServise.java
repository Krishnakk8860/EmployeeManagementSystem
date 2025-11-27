package com.employee.management.servise;

import com.employee.management.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeServise {
  public List<Employee> getAllEmploye();

   public Employee getEmployeeId(Long id);

    public Employee addEmployee(Employee employee);

   public Employee updateEmployee(Employee employee);

    public Employee deleteEmployee(Long id);
}
