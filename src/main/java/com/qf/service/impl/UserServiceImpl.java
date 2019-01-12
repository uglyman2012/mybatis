package com.qf.service.impl;

import com.qf.dao.IUserDao;
import com.qf.entity.Student;
import com.qf.service.IUserservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author mac
 *
 * @Date 2019-01-12
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements IUserservice {
    @Autowired
    private IUserDao userDao;

    @Override
    public List<Student> queryAll() {
        return userDao.queryAll();
    }
}
