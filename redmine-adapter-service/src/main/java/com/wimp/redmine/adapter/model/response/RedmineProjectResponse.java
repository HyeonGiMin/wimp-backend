package com.wimp.redmine.adapter.model.response;

import lombok.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RedmineProjectResponse {
    private List<ProjectDto> projects;
    private Integer total_count;
    private Integer offset;
    private Integer limit;
}
