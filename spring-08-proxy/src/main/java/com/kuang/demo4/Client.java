package com.kuang.demo4;

import com.kuang.demo1.Proxy;
import com.kuang.demo2.UserService;
import com.kuang.demo2.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        //真实角色
        UserServiceImpl userService = new UserServiceImpl();
        //代理角色，不存在
        ProxyInvocationHandler handler = new ProxyInvocationHandler();
        handler.setTarget(userService);
        UserService proxy =(UserService) handler.getProxy();
        proxy.update();
    }
}
