package com.kuang.dao;

public class UserDaoMySQL implements UserDao{
    @Override
    public void getUser() {
        System.out.println("mysql获取用户数据");
    }
}
