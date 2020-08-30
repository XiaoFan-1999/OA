package com.cd.oa.service;

import com.cd.oa.entity.Department;

import java.util.List;

/**
 * 部门的增删改查
 */
public interface DepartmentService {

    void add(Department department);

    void update(Department department);

    void delete(String id);

    Department get(String id);

    List<Department> getAll();

}
