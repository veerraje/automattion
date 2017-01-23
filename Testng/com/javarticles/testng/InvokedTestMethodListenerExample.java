package com.javarticles.testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(InvokedTestMethodListener.class)
public class InvokedTestMethodListenerExample {

    @BeforeTest
    public void beforeTest1() {
        System.out.println("beforeTest1");
    }

    @BeforeTest
    public void beforeTest2() {
        System.out.println("beforeTest2");
    }

    @Test
    public void t1() {
        System.out.println("t1");
    }

    @Test
    public void t2() {
        System.out.println("t2");
    }

    @Test
    public void t3() {
        System.out.println("t3");
    }

    @Test
    public void t4() {
        System.out.println("t4");
    }

    @AfterTest
    public void afterTest1() {
        System.out.println("afterTest1");
    }

    @AfterTest
    public void afterTest2() {
        System.out.println("afterTest2");
    }
}
