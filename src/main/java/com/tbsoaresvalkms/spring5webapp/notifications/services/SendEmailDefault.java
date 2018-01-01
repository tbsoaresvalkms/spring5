package com.tbsoaresvalkms.spring5webapp.notifications.services;

import com.tbsoaresvalkms.spring5webapp.notifications.models.Email;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile({"test", "default"})
@Component
public class SendEmailDefault implements Notification<Email> {
    @Override
    public void sender(Email email) {
        System.out.println(String.format("Simulating the Send the email to %s", email.getDestiny()));
    }
}
