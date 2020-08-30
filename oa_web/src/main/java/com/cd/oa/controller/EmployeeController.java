package com.cd.oa.controller;

import com.cd.oa.entity.Employee;
import com.cd.oa.global.Contant;
import com.cd.oa.service.DepartmentService;
import com.cd.oa.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller("employeeController")
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping("/list")
    public String list(Map<String,Object> map){
        map.put("list",employeeService.getAll());
        return "employee_list";
    }

    @RequestMapping("/toAdd")
    public String toAdd(Map<String,Object> map){
        map.put("employee",new Employee());
        map.put("dlist",departmentService.getAll());
        map.put("plist", Contant.getPosts());
        return "employee_add";
    }

    @RequestMapping("/add")
    public String add(Employee employee){
        employeeService.add(employee);
        return "redirect:/employee/list";
    }

    @RequestMapping(value="/toUpdate/{id}")
    public String toUpdate(@PathVariable(value="id") String id,Map<String,Object> map){
        map.put("employee",new Employee());
        map.put("employee",employeeService.get(id));
        map.put("dlist",departmentService.getAll());
        map.put("plist",Contant.getPosts());
        return "employee_update";
    }

    @RequestMapping("/update")
    public String update(Employee employee){
        employeeService.update(employee);
        return "redirect:/employee/list";
    }

    @RequestMapping("/remove/{id}")
    public String remove(@PathVariable("id")String id){
        employeeService.delete(id);
        return "redirect:/employee/list";
    }
}
