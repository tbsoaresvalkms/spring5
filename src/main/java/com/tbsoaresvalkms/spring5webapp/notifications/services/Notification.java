package com.tbsoaresvalkms.spring5webapp.notifications.services;

import com.tbsoaresvalkms.spring5webapp.notifications.models.NotificationObject;
import org.springframework.stereotype.Component;

@Component
public interface Notification<T extends NotificationObject> {
    void sender(T t);
}
