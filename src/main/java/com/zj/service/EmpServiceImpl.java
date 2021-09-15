package com.zj.service;

import com.zj.dao.EmpDao;
import com.zj.entity.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


@Service
@Transactional
public class EmpServiceImpl implements EmpService {

    @Resource
    private EmpDao empDao;

    @Override
    public List<Emp> findAllEmp() {
       return empDao.findAllEmp();
    }

    @Override
    public void deleteEmp(Integer id) {
        empDao.deleteEmp(id);
    }

    @Override
    public void insertEmp(Emp emp) {
        empDao.insertEmp(emp);
    }

    @Override
    public Emp queryEmp(Integer id) {
       return empDao.queryEmp(id);
    }

    @Override
    public void updateEmp(Emp emp) {
        empDao.updateEmp(emp);
    }
}
