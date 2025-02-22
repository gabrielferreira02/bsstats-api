package com.gabrielferreira02.bsstats.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RarityDTO {
    @JsonProperty("name")
    private String name;

    @JsonProperty("color")
    private String color;
}
