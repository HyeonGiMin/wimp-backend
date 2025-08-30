package com.wimp.redmine.adapter.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
@ConfigurationProperties(prefix = "redmine")
@Getter
@Setter
public class RedmineProperties implements RedminePropertiesInterface {
    private String baseUrl;
    private String apiKey;

    private static final Logger log = LoggerFactory.getLogger(RedmineProperties.class);

    @PostConstruct
    public void logProperties() {
        log.info("Bound Redmine properties: baseUrl='{}', apiKey set={}", baseUrl, apiKey != null && !apiKey.isEmpty());
    }

    // Lombok provides getters/setters which satisfy the interface
}
