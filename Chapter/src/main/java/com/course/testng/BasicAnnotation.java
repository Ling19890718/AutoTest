package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.println("这个是测试用例1");

    }

    @Test
    public void testCase2(){
        System.out.println("这是测试用例2");
    }
    //每个用例运行前运行
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod这是在测试方法之前运行的");

    }
    //每个用例运行后运行
    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod这是在测试方法之前运行的");
    }


    //BeforeClass是在类运行前运行
    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass是在整个测试集运行前运行");
    }

    //AfterClass是在类运行前运行
    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass是在整个测试集运行后运行");
    }


    //是在整个测试集运行前运行
    @BeforeSuite
    public void beforSuite(){
        System.out.println("BeforeSuite测试套件");

    }
    //在整个测试集运行后运行
    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite测试套件");

    }
}


