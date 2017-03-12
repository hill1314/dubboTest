package com.hull;

import com.hull.service.TestService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;


/**
 * Created by Administrator on 2017/3/12.
 */
public class ClientMain {
    public static void sayHello(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationConsumer.xml" });
        context.start();
        TestService testServer = (TestService) context.getBean("testService");
        String str = testServer.sayHello("Morning"+"1:"+ new Date());
        System.out.println("client:"+str +"3:"+ new Date());
    }

    public static void main(String[] args){
        sayHello();
    }
}
