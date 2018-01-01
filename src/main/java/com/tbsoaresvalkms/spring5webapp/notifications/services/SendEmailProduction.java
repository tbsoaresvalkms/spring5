package com.tbsoaresvalkms.spring5webapp.notifications.services;

import com.tbsoaresvalkms.spring5webapp.notifications.models.Email;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Profile("production")
@Component
public class SendEmailProduction implements Notification<Email>, InitializingBean, DisposableBean {
    @Override
    public void sender(Email email) {
        System.out.println(String.format("Sending the email to %s", email.getDestiny()));
        System.out.println(String.format("Message: %s\n%s\nsended.", email.getTitle(), email.getMessage()));
    }

    @PostConstruct
    public void initConstruct() {
        System.out.println("Construct created");
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("All right to use");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Wait bean!");
    }

    @Override
    public void destroy() {
        System.out.println("Bye bye bean!");
    }
}
