package com.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {

    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){
        System.out.println("name: "+name+";"+"age: "+age);
    }

    @DataProvider(name = "data")
    public Object[][] providerData(){
        Object[][] o = new Object[][]{
                {"zhangsan",10},
                {"lisi",20},
                {"wangwu",30}
        };
        return o;
    }

    @Test(dataProvider = "MethodData")
    public void test1(String name,int age){
        System.out.println("test1的方法 name:"+name+";"+"age:"+age);
    }
    @Test(dataProvider = "MethodData")
    public void test2(String name,int age){
        System.out.println("test2的方法 name:"+name+";"+"age:"+age);
    }

    @DataProvider(name ="MethodData")
    public Object[][] methodProvider(Method method){
        Object[][] result = null;
        if(method.getName().equals("test1")){
            result = new Object[][]{
                    {"zhangsan",30},
                    {"lisi",40}

            };
        }else if(method.getName().equals("test2")){
            result = new Object[][]{
                    {"wangwu",50},
                    {"zhaoliu",60}

            };
        }
        return result;
    }

}
