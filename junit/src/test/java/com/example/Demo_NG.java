package com.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * @auther David
 * @date 2020/5/16 11:13
 * @Version 1.0
 */
public class Demo_NG {

    @BeforeMethod
    public void setUp() {
        System.out.println("在test主体启动之前, 先执行setUp这个方法");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("在test主体启动之后, 执行tearDown这个方法");
    }

    @Test
    public void testPrint() {
        System.out.println("executed through NG");
    }
}