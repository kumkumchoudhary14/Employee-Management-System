package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Employee;


public interface IEmployeeService {
    List<Employee> getAllEmployee();
    Employee getEmployeeById(int empId);
    void addEmployee(Employee employee);
    void updateEmployee(Employee employee, int empId);
    void deleteEmployee(int empId);

    List<Employee> getEmployeeByDept(String deptName);
}
