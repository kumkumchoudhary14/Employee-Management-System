package com.example.demo.dao;

import com.example.demo.dto.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IProjectDAO extends JpaRepository<Project,Integer> {
        List<Project> findByEmployeeEmpId(int empId);

        }