package com.boot;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        /*
        only java
         */
        Student student = new Student(
                1,"Noto",25
        );

        System.out.println( "Only Java" );
        System.out.println( student.toString() );

        BeanFactory beanFactory = new FileSystemXmlApplicationContext("studentbean.xml");
        Student student1 = (Student) beanFactory.getBean("student");
        System.out.println( "With Bean" );
        System.out.println( student1.toString() );


    }

}