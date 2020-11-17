package com.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite测试套件,运行啦");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite测试套件,运行啦");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest测试方法前");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("afterTest测试方法后");
    }
}
