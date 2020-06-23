package com.argos.retryanlyser;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/*
 * Ravi's Creation
 * Date of Creation
 */
public class MyAnnotationTransfer implements IAnnotationTransformer {

    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
        annotation.setRetryAnalyzer(RetryAnalyzer.class);

//        IRetryAnalyzer retry = annotation.getRetryAnalyzer();
//        if(retry == null);
//        ITestAnnotation.setRetryAnalyzer(RetryAnalyzer.class);
    }
}
