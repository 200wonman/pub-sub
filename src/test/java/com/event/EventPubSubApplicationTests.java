package com.event;

import com.event.pub.EventPublisher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EventPubSubApplicationTests {

    @Autowired
    private EventPublisher eventPublisher;

    @Test
    void contextLoads() {
    }

    @Test
    void testCustomEventPublishing() {

        eventPublisher.publishCustomEvent("Hello World!");

    }
}
