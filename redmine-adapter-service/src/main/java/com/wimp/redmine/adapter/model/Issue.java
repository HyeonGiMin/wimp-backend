package com.wimp.redmine.adapter.model;

import lombok.*;
import java.time.OffsetDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Issue {
    private Long id;
    private String subject;
    private String description;
    private Integer trackerId;
    private Integer statusId;
    private Integer assignedToId;
    private Integer authorId;
    private OffsetDateTime createdOn;
    private OffsetDateTime updatedOn;
}
