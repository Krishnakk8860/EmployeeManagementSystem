package com.employee.management.dio;

import com.employee.management.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EmployeeDio  extends JpaRepository<Employee, Long>
{

}
