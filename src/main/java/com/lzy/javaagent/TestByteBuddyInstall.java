package com.lzy.javaagent;

import java.lang.instrument.Instrumentation;

import net.bytebuddy.agent.ByteBuddyAgent;

/**
 * @author liuzhengyang
 * 2022/4/13
 */
public class TestByteBuddyInstall {
    public static void main(String[] args) {
        Instrumentation install = ByteBuddyAgent.install();
        System.out.println(install);
//        install.addTransformer();
    }
}
