package com.gabrielferreira02.bsstats.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BrawlerDTO {
    @JsonProperty("id")
    private Long id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("imageUrl")
    private String image;

    @JsonProperty("description")
    private String description;

    @JsonProperty("rarity")
    private RarityDTO rarity;

    @JsonProperty("starPowers")
    private List<AccessoryDTO> starPowers;

    @JsonProperty("gadgets")
    private List<AccessoryDTO> gadgets;
}
