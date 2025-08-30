package com.wimp.redmine.adapter.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RedmineProjectDto {
    private Long id;
    private String name;
    private String identifier;
}
