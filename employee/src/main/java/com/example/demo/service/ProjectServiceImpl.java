package com.example.demo.service;

import com.example.demo.dao.IEmployeeDAO;
import com.example.demo.dao.IProjectDAO;
import com.example.demo.dto.Employee;
import com.example.demo.dto.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class ProjectServiceImpl implements IProjectService {
    @Autowired
   private IProjectDAO daoRef;
    @Override
    public List<Project> getProjectList(int empId) {
        System.out.println("in dao class employee id "+empId);
        return daoRef.findByEmployeeEmpId(empId);
    }
    @Override
    public Project getProjectById(int id)
    {
        return daoRef.getOne(id);
    }
    @Override
    public void addProject(Project proj)
    {
        daoRef.save(proj);
    }
    @Override
    public void updateProject(Project proj)
    {
        daoRef.save(proj);
    }
    @Override
    public void deleteProjectById(int id)
    {
        daoRef.deleteById(id);
    }
    @Override
    public List<Project> getAllProject()
    {
        return daoRef.findAll();
    }/* List<Employee> empList = new ArrayList<>(Arrays.asList(
            new Employee(1, "kumkum","eng"),
            new Employee(2, "astha","doc"),
            new Employee(3, "ankur","acc")
    ));
    @Autowired
    private IEmployeeDAO daoRef;

    @Override
    public List<Employee> getAllEmployee() {

        //return empList;
        return daoRef.findAll();
    }
    @Override
    public Employee getEmployeeById(int empId) {
        //return empList.stream().filter(e -> e.getEmpId() == empId).findFirst().get();
        return daoRef.getOne(empId);

    }
    @Override
    public void addEmployee(Employee employee) {
        // empList.add(employee);
        daoRef.save(employee);

    }
    @Override
    public void updateEmployee(Employee employee, int empId) {
        *//*for(int i=0;i<empList.size();i++)
        {
            Employee e=empList.get(i);
            if(e.getEmpId()==empId) {
                empList.set(i, employee);
                return;
            }
        }*//*
        daoRef.save(employee);

    }
    @Override
    public void deleteEmployee(int empId) {
        // TODO Auto-generated method stub
        //empList.removeIf(e ->e.getEmpId()==empId);
        daoRef.deleteById(empId);
    }

    @Override
    public List<Employee> getEmployeeByDept(String deptName) {
        return daoRef.findByDeptName(deptName);
    }*/


    @Override
    public List<Project> getAllProjects() {
        return null;
    }
}
