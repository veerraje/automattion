package com.javarticles.testng;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class TestFactory {
    private String param;
    
    public TestFactory(String param) {
        this.param = param;
    }
 
    @Test
    public void t() {
        System.out.println("TestFactory.t:" + param);
    }
     
    @Factory
    public Object[] create() {
        return new Object[] { new TestFactory("one"), new TestFactory("two"), new TestFactory("three")};
    }
}
