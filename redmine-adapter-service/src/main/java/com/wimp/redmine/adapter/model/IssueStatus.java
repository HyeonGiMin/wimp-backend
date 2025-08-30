package com.wimp.redmine.adapter.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class IssueStatus {
    private Integer id;
    private String name;
    private Boolean isClosed;
    private Integer defaultDoneRatio;
}
