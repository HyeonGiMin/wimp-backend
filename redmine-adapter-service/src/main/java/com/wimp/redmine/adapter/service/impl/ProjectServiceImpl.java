package com.wimp.redmine.adapter.service.impl;

import com.wimp.redmine.adapter.client.RedmineClient;
import com.wimp.redmine.adapter.model.response.RedmineProjectResponse;
import com.wimp.redmine.adapter.service.ProjectService;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService {
    private final RedmineClient client;

    public ProjectServiceImpl(RedmineClient client) {
        this.client = client;
    }

    @Override
    public RedmineProjectResponse getProjects(int limit, int offset) {
        return client.getProjects(limit, offset);
    }

    @Override
    public RedmineProjectResponse getProjects() {
        return client.getProjects();
    }
}
