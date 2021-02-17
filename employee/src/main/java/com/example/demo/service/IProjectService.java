package com.example.demo.service;

import com.example.demo.dto.Employee;
import com.example.demo.dto.Project;

import java.util.List;

public interface IProjectService {
    List<Project> getAllProjects();

    List<Project> getProjectList(int empId);

    List<Project> getAllProject();

    Project getProjectById(int id);

    void addProject(Project proj);

    void updateProject(Project proj);

    void deleteProjectById(int id);
}
