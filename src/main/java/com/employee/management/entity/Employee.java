package com.employee.management.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Employee {
    @Id
    private Long id;
    private String name;
    private String department;
    private  Long salary;

    public Employee() {
    }
    public  Employee(long id, String name, String department, Long salary)
    {
        this.id=id;
        this.name =name;
        this.department=department;
        this.salary=salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

}
