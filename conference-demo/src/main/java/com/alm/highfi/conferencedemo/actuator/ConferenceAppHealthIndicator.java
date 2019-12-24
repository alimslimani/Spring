package com.alm.highfi.conferencedemo.actuator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;

public class ConferenceAppHealthIndicator implements HealthIndicator {
    private final static String message_key = "ConferenceService";

    @Override
    public Health health() {
        if (!isRunningPeopleService()) {
            return Health.down().withDetail(message_key, "Not Available").build();
        }
        return Health.up().withDetail(message_key, "Available").build();
    }

    private Boolean isRunningPeopleService() {
        Boolean isRunning = false;
        return isRunning;
    }
}
