package com.boot.config;

import com.boot.CustomBeanFactoryPostProcessor;
import com.boot.CustomBeanPostProcessor;
import com.boot.beans.Room;
import com.boot.beans.Student;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan( basePackages = "com.boot.beans")
public class Config {

    @Bean
    public static BeanFactoryPostProcessor beanFactoryPostProcessor() {

        return new CustomBeanFactoryPostProcessor();

    }

    @Bean
    public static BeanPostProcessor beanPostProcessor() {

        return new CustomBeanPostProcessor();

    }

    @Bean(initMethod = "customInit", destroyMethod = "customDestroy")
    public Room room(){

        return new Room()  ;

    }

//    @Bean
//    public Student student(){
//
//        return new Student() ;
//
//    }

}
