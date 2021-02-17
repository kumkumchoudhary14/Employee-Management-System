package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import com.example.demo.dto.Employee;
import com.example.demo.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class EmployeeController {
    @Autowired
    IEmployeeService empServiceRef;

    @RequestMapping("/welcome")
    public String welcomeEmployee()
    {
        return "Hello Employee";
    }
    @RequestMapping("/employees")
    public List<Employee> getAllEmployees(){
        return empServiceRef.getAllEmployee();

    }
    @RequestMapping("/employees/{empId}")
    public Employee getEmployeeById(@PathVariable int empId)
    {
        return empServiceRef.getEmployeeById(empId);
    }
    @RequestMapping(method=RequestMethod.POST,value="/employees")
    public void addEmployee(@RequestBody Employee employee) {
        empServiceRef.addEmployee(employee);
    }
    @RequestMapping(method=RequestMethod.PUT,value="/employees/{empId}")
    public void updateEmployee(@RequestBody Employee employee, @PathVariable int empId) {
        empServiceRef.updateEmployee(employee,empId);
    }
    @RequestMapping(method=RequestMethod.DELETE,value="/employees/{empId}")
    public void deleteEmployee( @PathVariable int empId) {
        empServiceRef.deleteEmployee(empId);
    }
    @RequestMapping("/employees/dept/{deptName}")
    public List<Employee> getEmployeeByDept( @PathVariable String deptName) {
       return empServiceRef.getEmployeeByDept(deptName);
    }

}
