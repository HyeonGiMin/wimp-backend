package com.wimp.redmine.adapter.controller;

import com.wimp.redmine.adapter.model.response.RedmineProjectResponse;
import com.wimp.redmine.adapter.service.ProjectService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/redmine/projects")
public class ProjectController {

	private final ProjectService service;

	public ProjectController(ProjectService service) {
		this.service = service;
	}

	@GetMapping
	public RedmineProjectResponse list(@RequestParam(defaultValue = "100") int limit,
									   @RequestParam(defaultValue = "0") int offset) {
		return service.getProjects(limit, offset);
	}
}
