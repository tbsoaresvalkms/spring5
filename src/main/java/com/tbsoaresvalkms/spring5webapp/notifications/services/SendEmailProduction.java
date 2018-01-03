package com.tbsoaresvalkms.spring5webapp.notifications.services;

import com.tbsoaresvalkms.spring5webapp.notifications.models.Email;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("production")
@Component
public class SendEmailProduction implements Notification<Email> {
    @Override
    public void sender(Email email) {
        System.out.println(String.format("Sending the email to %s", email.getDestiny()));
        System.out.println(String.format("Message: %s\n%s\nsended.", email.getTitle(), email.getMessage()));
    }

}
