package com.itheima.dao.impl;

import com.itheima.dao.AccountDao;

import java.util.List;

public class AccountDaoImpl implements AccountDao{
    @Override
    public List findAll() {
        System.out.println("查询列表成功");
        return null;
    }
}
