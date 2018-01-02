package com.tbsoaresvalkms.spring5webapp.notifications.models;

import lombok.Builder;

@Builder
public class Email implements NotificationObject {

    private String destiny;
    private String title;
    private String message;

    public Email(String destiny, String title, String message) {
        this.destiny = destiny;
        this.title = title;
        this.message = message;
    }

    @Override
    public String getDestiny() {
        return this.destiny;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
