package com.javarticles.testng;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class InvokedTestMethodListener implements IInvokedMethodListener {

    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        if ("t2".equals(method.getTestMethod().getMethodName())) {
            System.out.println("Invoked just before t2()");
        }
    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        if ("t2".equals(method.getTestMethod().getMethodName())) {
            System.out.println("Invoked just after t2()");
        }
    }
}
