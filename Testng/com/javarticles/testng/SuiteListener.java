package com.javarticles.testng;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class SuiteListener implements ISuiteListener {

    @Override
    public void onStart(ISuite suite) {
        System.out.println("Start of suite " + suite.getName());
    }

    @Override
    public void onFinish(ISuite suite) {
        System.out.println("Finish of suite " + suite.getName());
    }

}
