package com.boot;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import java.util.Iterator;

public class CustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        System.out.println( "Starting .......... BeanFactoryPostProcessor!" );

        Iterator<String> itr = beanFactory.getBeanNamesIterator();

        while (itr.hasNext()) {

            String beanName = itr.next();
            System.out.println( beanName );

        }

        System.out.println( "Ending .............. BeanFactoryPostProcessor!" );

    }

}
