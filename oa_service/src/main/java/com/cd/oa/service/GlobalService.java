package com.cd.oa.service;

import com.cd.oa.entity.Employee;

public interface GlobalService {

    /**
     * 登录
     * @param id
     * @param password
     * @return
     */
    Employee login(String id,String password);

    /**
     * 修改密码
     * @param employee
     */
    void changePassword(Employee employee);
}
