package com.lzy.javaagent;

/**
 * @author liuzhengyang
 * 2022/4/13
 */
public class Test {
    public void hello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        new Test().hello();
    }
}
