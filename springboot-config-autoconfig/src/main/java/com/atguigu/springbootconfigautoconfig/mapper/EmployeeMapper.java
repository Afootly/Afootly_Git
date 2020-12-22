package com.atguigu.springbootconfigautoconfig.mapper;

import com.atguigu.springbootconfigautoconfig.bean.Department;
import com.atguigu.springbootconfigautoconfig.bean.Employee;
import org.apache.ibatis.annotations.*;
/*
使用sql映射文件的方式
 */

public interface EmployeeMapper {

    public Employee getEmpById( Integer id);

     public  void insertEmp(Employee employee);


}
