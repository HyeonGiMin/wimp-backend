package com.wimp.redmine.adapter.service;

import com.wimp.redmine.adapter.model.response.RedmineProjectResponse;

/**
 * Service interface for accessing Redmine projects.
 */
public interface ProjectService {
    RedmineProjectResponse getProjects(int limit, int offset);
    RedmineProjectResponse getProjects();
}
