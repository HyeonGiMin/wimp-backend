package com.wimp.redmine.adapter.model.response;

import lombok.*;
import java.time.OffsetDateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProjectDto {
    private Integer id;
    private String name;
    private String identifier;
    private String description;
    private Integer status;

    @JsonProperty("is_public")
    private Boolean isPublic;

    @JsonProperty("inherit_members")
    private Boolean inheritMembers;

    @JsonProperty("custom_fields")
    private List<CustomFieldDto> customFields;

    private ParentDto parent;

    @JsonProperty("created_on")
    private OffsetDateTime createdOn;

    @JsonProperty("updated_on")
    private OffsetDateTime updatedOn;
}
