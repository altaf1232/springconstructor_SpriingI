package com.springconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context =new ClassPathXmlApplicationContext("const.xml");
        TestConstructor testConstructor =(TestConstructor)context.getBean("Aconstructor");
        System.out.println(testConstructor);
    }
}
