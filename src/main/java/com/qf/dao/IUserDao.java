package com.qf.dao;

import com.qf.entity.Student;

import java.util.List;

/**
 * Author mac
 *
 * @Date 2019-01-12
 * @Version 1.0
 */
public interface IUserDao {
     List<Student> queryAll();
}
