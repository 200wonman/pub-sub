package com.event.pub;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class EventSubscriber {

    @EventListener
    public void onApplicationEvent(CustomEvent event) {

        log.info("Received custom event - " + event.getMessage());
    }
}

