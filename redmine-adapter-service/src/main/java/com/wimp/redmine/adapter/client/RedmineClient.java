package com.wimp.redmine.adapter.client;

import com.wimp.redmine.adapter.config.RedminePropertiesInterface;
import com.wimp.redmine.adapter.model.response.RedmineProjectResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class RedmineClient  {
    private final RedminePropertiesInterface properties;
    private final WebClient webClient;

    public RedmineClient(RedminePropertiesInterface properties) {
        this.properties = properties;
        this.webClient = WebClient.builder()
                .baseUrl(properties.getBaseUrl())
                .defaultHeader("X-Redmine-API-Key", properties.getApiKey())
                .build();
    }

    public RedmineProjectResponse getProjects(int limit, int offset) {
        String uri = String.format("/projects.json?limit=%d&offset=%d", limit, offset);
        var response = webClient.get()
                .uri(uri)
                .retrieve()
                .bodyToMono(RedmineProjectResponse.class)
                .block();

        return response;
    }

    public RedmineProjectResponse getProjects() {
        return getProjects(100, 0);
    }
}
