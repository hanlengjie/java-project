package com.zj.dao;

import com.zj.entity.Emp;

import java.util.List;

public interface EmpDao {
    //查询全表
    List<Emp> findAllEmp();

    //删除
    void deleteEmp(Integer id);

    //添加
    void insertEmp(Emp emp);

    //修改
    Emp queryEmp(Integer id);
    void updateEmp(Emp emp);
}
