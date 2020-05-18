package com.example

/**
 * @auther David* @date 2020/5/17 23:10
 * @Version 1.0
 */
class Demo_Groovy {
    void setUp() {
        super.setUp()
        println "start";
    }

    void tearDown() {
        println "end";
    }
    void testPrint() {
        println "test groovy..";
    }
}
