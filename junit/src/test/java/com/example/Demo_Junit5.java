package com.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/**
 * @auther David
 * @date 2020/5/16 11:02
 * @Version 1.0
 */
class Demo_Junit5 {

    @BeforeEach
    void setUp() {
        System.out.println("在test启动之前, 先执行setUp这个方法");
    }

    @AfterEach
    void tearDown() {
        System.out.println("在test主体执行之后, 执行这个方法");
    }

    @Test
    void superMethod() {
        System.out.println("test junit 5");
    }

    @Test
    void print() {
        System.out.println("test junit 5, print");
    }
}