package com.hull;

import com.hull.com.hull.controller.ChatAction;
import com.hull.service.TestService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;


/**
 * Created by Administrator on 2017/3/12.
 */
public class ClientMain {

    public static void main(String[] args){
        ChatAction act = new ChatAction();
        act.sayHello();
    }
}
