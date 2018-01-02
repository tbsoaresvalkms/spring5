package com.tbsoaresvalkms.spring5webapp;

import com.tbsoaresvalkms.spring5webapp.commands.interfaces.CommandParameter;
import com.tbsoaresvalkms.spring5webapp.notifications.models.Email;
import org.springframework.stereotype.Component;

@Component
public class ManualInitializer {

    private final CommandParameter<Email> sendEmailToClient;

    public ManualInitializer(CommandParameter<Email> sendEmailToClient) {
        this.sendEmailToClient = sendEmailToClient;
    }

    public void execute() {
        Email email = Email.builder()
                .destiny("thiago@gmail.com")
                .title("Bem vindo!")
                .message("Estamos muito felizes!")
                .build();

        sendEmailToClient.execute(email);
    }
}
