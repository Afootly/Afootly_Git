package com.atguigu.springbootconfigautoconfig.mapper;

import com.atguigu.springbootconfigautoconfig.bean.Department;
import org.apache.ibatis.annotations.*;
/*
使用注解的方式
 */
 //指定这是一个操作数据库的mapper
public interface DepartmentMapper {
    @Select("select * from department where id=#{id}")
    public Department getDeptById(Integer id);

    @Delete("delete from depertment where id=#{id}")
    public int deleteDeptById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")//获取自增类型主键的值
    @Insert("insert  into department(departmentName) values(#{departmentName})")
    public int insertDeptById(Department department);

    @Update("update department set departmentName=#{departmentName} where id=#{id} ")
    public int updateDeptById(Department department);
}
