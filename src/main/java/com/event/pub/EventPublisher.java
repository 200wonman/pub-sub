package com.event.pub;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class EventPublisher {
    private final ApplicationEventPublisher applicationEventPublisher;

    public EventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void publishCustomEvent(String message) {
        CustomEvent customEvent = new CustomEvent(this, message);
        log.info("Publishing custom event: " + customEvent);
        applicationEventPublisher.publishEvent(customEvent);
    }


}
