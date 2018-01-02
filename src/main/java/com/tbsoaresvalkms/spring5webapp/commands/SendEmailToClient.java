package com.tbsoaresvalkms.spring5webapp.commands;

import com.tbsoaresvalkms.spring5webapp.commands.interfaces.CommandParameter;
import com.tbsoaresvalkms.spring5webapp.notifications.models.Email;
import com.tbsoaresvalkms.spring5webapp.notifications.services.Notification;
import org.springframework.stereotype.Service;

@Service
public class SendEmailToClient implements CommandParameter<Email> {
    private final Notification<Email> sendNotification;

    public SendEmailToClient(Notification<Email> sendNotification) {
        this.sendNotification = sendNotification;
    }

    @Override
    public void execute(Email email) {
        sendNotification.sender(email);
    }
}
