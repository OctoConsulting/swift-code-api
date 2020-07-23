package com.challenge.swiftcode.config;

import org.springframework.context.ApplicationListener;
        import org.springframework.context.event.ContextRefreshedEvent;
        import org.springframework.stereotype.Component;

import java.util.TimeZone;

@Component
public class ApplicationStartup implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(final ContextRefreshedEvent event) {
        TimeZone.setDefault(TimeZone.getTimeZone("America/New_York"));
    }
}