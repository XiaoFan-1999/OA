package com.cd.oa.service.serviceImpl;

import com.cd.oa.dao.EmployeeDao;
import com.cd.oa.entity.Employee;
import com.cd.oa.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
    @Qualifier("employeeDao")
    @Autowired
    private EmployeeDao employeeDao;

    public void add(Employee employee) {
        employeeDao.add(employee);
    }

    public void update(Employee employee) {
        employeeDao.update(employee);
    }

    public void delete(String id) {
        employeeDao.delete(id);
    }

    public Employee get(String id) {
        return employeeDao.select(id);
    }

    public List<Employee> getAll() {
        return employeeDao.selectAll();
    }
}
