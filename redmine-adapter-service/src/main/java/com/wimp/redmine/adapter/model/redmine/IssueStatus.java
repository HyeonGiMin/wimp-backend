package com.wimp.redmine.adapter.model.redmine;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IssueStatus {
    public IssueStatus(){

    }

    public IssueStatus(int id, String name, boolean isClosed) {
        this.id = id;
        this.name = name;
        this.isClosed = isClosed;
    }
    private int id;
    private String name;
    @JsonProperty("is_closed")
    private boolean isClosed;
}
