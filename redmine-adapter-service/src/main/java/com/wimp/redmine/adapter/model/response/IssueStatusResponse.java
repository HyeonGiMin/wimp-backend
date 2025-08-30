package com.wimp.redmine.adapter.model.response;

import com.wimp.redmine.adapter.model.redmine.IssueStatus;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class IssueStatusResponse {
    private List<IssueStatus> issue_statuses;
}
