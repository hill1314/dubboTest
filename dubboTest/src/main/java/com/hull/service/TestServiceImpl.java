package com.hull.service;

//import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/3/12.
 */
//@Service
public class TestServiceImpl implements TestService{
    public String sayHello(String str) {
        String result = "Hello "+str;
        System.out.println(result);
        return result;
    }
}
