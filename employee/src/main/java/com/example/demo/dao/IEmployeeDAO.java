package com.example.demo.dao;

import com.example.demo.dto.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEmployeeDAO extends JpaRepository<Employee,Integer> {
   List<Employee> findByDeptName(String deptName);
}
