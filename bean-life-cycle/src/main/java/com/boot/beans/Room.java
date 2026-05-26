package com.boot.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Room implements InitializingBean , DisposableBean {

    private Student student;

    @PostConstruct
    public void postConstructor() {

        System.out.println( "Room :: postConstructor" );

    }

    public Room() {

        System.out.println( "Room constructor" );

    }

    @Autowired
    public void setStudent( Student student ) {

        System.out.println( "setStudent" + student.getClass().getSimpleName() );
        this.student = student;

    }

    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println( "Room :: afterPropertiesSet" );

    }

    public void customInit(){

        System.out.println( this.getClass().getSimpleName() + " :: customInit"  );

    }

    public void studentOfRoom( Student student ) {

        System.out.println( student.getName() + " :: studentOfRoom" );

    }

    @PreDestroy
    public void preDestroy() {

        System.out.println( this.getClass().getSimpleName() + " :: predestory" );

    }

    public void destroy() throws Exception {

        System.out.println( "DisposableBean " + this.getClass().getSimpleName() + " :: destroy" );

    }

    public void customDestroy(){

        System.out.println( this.getClass().getSimpleName() + " :: customDestroy" );

    }

}
