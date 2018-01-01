package com.tbsoaresvalkms.spring5webapp.configurations;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoggerAllBeans implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof BeanLifeCycle) ((BeanLifeCycle) bean).beforeInit();
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof BeanLifeCycle) ((BeanLifeCycle) bean).afterInit();
        return bean;
    }
}
