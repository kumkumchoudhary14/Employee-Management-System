package com.example.demo.controller;

import com.example.demo.dto.*;
import com.example.demo.service.IEmployeeService;
import com.example.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProjectController  {
    @Autowired
    private IProjectService serviceProj;

    @RequestMapping("/employees/{empId}/projects")
    public List<Project> getAllProjects(@PathVariable int empId)
    {
        System.out.println("In project controller");
        List<Project>  projList =serviceProj.getProjectList(empId);
        System.out.println(projList);
        return projList;
    }

    @RequestMapping("/projects")
    public List<Project> getProjectList(){
        return serviceProj.getAllProject();

    }
    @RequestMapping("/employees/{empId}/projects/{id}")
    public Project getProjectById(@PathVariable int id)
    {return  serviceProj.getProjectById(id);
    }
    @RequestMapping( method=RequestMethod.POST,value="/employees/{empId}/projects")
    public void  addProject(@RequestBody Project proj ,@PathVariable int empId)
    {proj.setEmployee(new Employee(empId,"",""));
    serviceProj.addProject(proj);
    }
    @RequestMapping( method=RequestMethod.PUT,value="/employees/{empId}/projects/{id}")
    public void  updateProject(@RequestBody Project proj ,@PathVariable int empId)
    {proj.setEmployee(new Employee(empId,"",""));
        serviceProj.updateProject(proj);
    }
    @RequestMapping( method=RequestMethod.DELETE,value="/projects/{id}")
    public void  deleteProjectById(@PathVariable int id)
    {
        serviceProj.deleteProjectById(id);
    }


    /*@RequestMapping("/employees/{empId}")
    public Employee getEmployeeById(@PathVariable int empId)
    {
        return empServiceRef.getEmployeeById(empId);
    }
    @RequestMapping(method= RequestMethod.POST,value="/employees")
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
    }*/
}
