package com.javarticles.testng;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({SuiteListener.class})
public class TestListener {

    @Test
    public void t() {
        System.out.println("test t()" );
    }        
}
