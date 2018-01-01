package com.tbsoaresvalkms.spring5webapp.configurations;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Configuration
public class BeanLifeCycle implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {
    public BeanLifeCycle() {
        System.out.println("## Construct called");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## setBeanFactory: " + beanFactory.toString());
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("## setBeanName: " + s);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## setApplicationContext: " + applicationContext);
    }

    public void beforeInit() {
        System.out.println("## BeanPostProcessor: beforeInitialization");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("## postConstruct");
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("## afterPropertiesSet");
    }

    public void afterInit() {
        System.out.println("## BeanPostProcessor: afterInitialization");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("## preDestroy");
    }

    @Override
    public void destroy() {
        System.out.println("## destroy");
    }
}
