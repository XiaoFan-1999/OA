package com.cd.oa.service;

import com.cd.oa.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 雇员的增删改查
 */

public interface EmployeeService {

    void add(Employee employee);

    void update(Employee employee);

    void delete(String id);

    Employee get(String id);

    List<Employee> getAll();
}
