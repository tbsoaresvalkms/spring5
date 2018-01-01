package com.tbsoaresvalkms.spring5webapp.services;

import com.tbsoaresvalkms.spring5webapp.notifications.models.Email;
import com.tbsoaresvalkms.spring5webapp.notifications.services.Notification;
import org.springframework.stereotype.Service;

@Service
public class BookServices implements Services {
    private Notification<Email> sendNotification;

    public BookServices(Notification<Email> sendNotification) {
        this.sendNotification = sendNotification;
    }

    @Override
    public void execute() {
        sendNotification.sender(new Email("thiago@gmail.com", "Important", "Hello world"));
    }
}
