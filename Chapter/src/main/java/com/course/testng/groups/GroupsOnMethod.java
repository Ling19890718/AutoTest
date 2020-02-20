package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {

    @Test(groups = "server")
    public  void test1(){
        System.out.println("这个是服务端的测试方法111");

    }
    @Test(groups = "server")
    public  void test2(){
        System.out.println("这个是服务端的测试方法222");

    }
    @Test(groups = "client")
    public  void test3(){
        System.out.println("这个是客户端的测试方法11111111");

    }
    @Test(groups = "client")
    public  void test4(){
        System.out.println("这个是客户端的测试方法222222");

    }

    @BeforeGroups(groups = "server")
    public void beforeGroups(){
        System.out.println("这个是服务端执行前运行的方法");
    }
    @AfterGroups(groups = "server")
    public void afterGroups(){
        System.out.println("这个是服务端执行后运行的方法");
    }
}
