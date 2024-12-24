package com.sky.service;

import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import com.sky.result.PageResult;
import com.sky.result.Result;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

    /*
    * 新增员工
    * */
    void save(EmployeeDTO employeeDTO);

    /*
    *
    * 分页查询
    * */
    PageResult pageQuery(EmployeePageQueryDTO employeePageQueryDTO);

    /*
    * 启用禁用员工账号
    * */
    void startOrStop(Integer status, Long id);

/*
* 查询回显
* */
    Employee query(Long id);

    /*
    * 编辑员工信息
    * */
    void update(EmployeeDTO employeeDTO);
}
