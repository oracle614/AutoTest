package com.course.testng;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by jason on 2019-2-27.
 */
public class Annotation {
    //最近本测试的一部分
    @Test
    public void testCase1(){
        System.out.printf("zheshitest");
    }
    @Test
    public void testCase2(){
        System.out.printf("test case 2 .....");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.printf("方法之前运行");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.printf("方式之后运行");
    }
}
