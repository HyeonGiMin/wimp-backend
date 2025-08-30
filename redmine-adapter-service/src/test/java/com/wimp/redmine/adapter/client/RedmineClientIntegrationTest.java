package com.wimp.redmine.adapter.client;

import com.wimp.redmine.adapter.config.RedmineProperties;
import com.wimp.redmine.adapter.model.response.RedmineProjectResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

import static org.junit.jupiter.api.Assertions.*;

@EnabledIfEnvironmentVariable(named = "REDMINE_BASE_URL", matches = ".+")
@EnabledIfEnvironmentVariable(named = "REDMINE_API_KEY", matches = ".+")
public class RedmineClientIntegrationTest {

    @Test
    void integration_getProjects_fromRemoteServer() {
        String baseUrl = System.getenv("REDMINE_BASE_URL");
        String apiKey = System.getenv("REDMINE_API_KEY");

        assertNotNull(baseUrl, "REDMINE_BASE_URL must be set for integration test");
        assertNotNull(apiKey, "REDMINE_API_KEY must be set for integration test");

        RedmineProperties props = new RedmineProperties();
        props.setBaseUrl(baseUrl);
        props.setApiKey(apiKey);

        RedmineClient client = new RedmineClient(props);

        RedmineProjectResponse resp = client.getProjects(25, 0);

        assertNotNull(resp, "Response should not be null");
        assertNotNull(resp.getProjects(), "projects list should not be null");
        assertTrue(resp.getTotal_count() >= 0, "total_count should be >= 0");
    }
}
