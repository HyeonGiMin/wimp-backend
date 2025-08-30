package com.wimp.redmine.adapter.dto;

import java.util.List;

public class RedmineProjectResponse {
    private List<RedmineProjectDto> projects;

    public List<RedmineProjectDto> getProjects() {
        return projects;
    }

    public void setProjects(List<RedmineProjectDto> projects) {
        this.projects = projects;
    }
}
