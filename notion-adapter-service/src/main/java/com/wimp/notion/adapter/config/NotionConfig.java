package com.wimp.notion.adapter.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
@Setter
public class NotionConfig {

    @Value("${notion.apiKey}")
    private String apiKey;

    @Value("${notion.databaseId}")
    private String databaseId;
}