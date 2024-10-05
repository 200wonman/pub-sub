package com.event.pub;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent {

    private final String message;

    public CustomEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "My Custom Event with message: " + message;
    }
}
