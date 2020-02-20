package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig {
    @BeforeSuite
    public void beforSuite(){
        System.out.println("beforSuite运行啦");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite运行啦");

    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest运行啦");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("afterTest运行啦");
    }
}
