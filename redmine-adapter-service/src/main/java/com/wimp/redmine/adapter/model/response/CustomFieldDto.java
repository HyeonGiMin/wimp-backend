package com.wimp.redmine.adapter.model.response;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonProperty;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomFieldDto {
    private Integer id;
    private String name;
    private String value;

    // Some responses may omit id/name and only provide value - keep fields nullable
}
