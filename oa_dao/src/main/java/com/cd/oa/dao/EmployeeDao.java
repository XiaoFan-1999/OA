package com.cd.oa.dao;

import com.cd.oa.entity.Employee;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("employeeDao")
public interface EmployeeDao {
    /**
     * 插入
     * @param employeee
     */
    void add(Employee employeee);

    /**
     * 更新
     * @param employee
     */
    void update(Employee employee);

    /**
     * 根据id删除
     * @param id
     */
    void delete(String id);

    /**
     * 根据id选择
     * @param id
     * @return
     */
    Employee select(String id);

    List<Employee> selectAll();

    List<Employee> selectByDepartmentAndPost(@Param("did") String did,@Param("post") String post);
}
