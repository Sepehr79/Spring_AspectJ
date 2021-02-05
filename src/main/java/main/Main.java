package main;

import beans.Operation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Operation operation = (Operation) applicationContext.getBean("opBean");

        operation.msg();
        operation.m();
        operation.k();

        operation.exceptionThrowable(10);
    }
}
