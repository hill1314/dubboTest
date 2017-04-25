package com.hull.com.hull.controller;

import com.hull.service.TestService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * Created by Administrator on 2017/4/25.
 */
public class ChatAction {
    public static void sayHello(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationConsumer.xml" });
        context.start();
        TestService testServer = (TestService) context.getBean("testService");
        String str = testServer.sayHello("Morning"+"1:"+ new Date().getTime());
        System.out.println("client receive:"+str +"3:"+ new Date().getTime());
    }
}
