package com.zj.controller;


import com.zj.entity.Emp;
import com.zj.service.EmpService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin  //解决跨域问题
public class EmpController {

    @Resource
    private EmpService  empService;

    //查询
    @RequestMapping("/findAllEmp")
    public List<Emp> findAllEmp(){
         return empService.findAllEmp();
    }


    //删除
    @RequestMapping("/deleteEmp")
    public void deleteEmp(Integer id){
         empService.deleteEmp(id);
    }


    //添加
    @RequestMapping("/insertEmp")
    public void insertEmp(@RequestBody Emp emp){
        empService.insertEmp(emp);
    }

    //修改
    @RequestMapping("/updateEmp")
    public void updateEmp(@RequestBody Emp emp){
        empService.updateEmp(emp);
    }

    @RequestMapping("/queryEmp")
    public Emp queryEmp(Integer id) {
        return empService.queryEmp(id);
    }


}
