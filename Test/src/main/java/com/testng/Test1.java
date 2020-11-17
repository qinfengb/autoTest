package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test1 {

    @Test
    public void testCase() {
        System.out.println("这是测试1");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("测试方法前");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("测试方法后");
    }
    @Test
    public void testCase2() {
        System.out.println("这是测试2");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("类运行前");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("类运行后");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite测试套件");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite测试套件");
    }


}
