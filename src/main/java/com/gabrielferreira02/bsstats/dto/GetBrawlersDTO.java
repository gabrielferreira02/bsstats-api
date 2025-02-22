package com.gabrielferreira02.bsstats.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class GetBrawlersDTO {
    @JsonProperty("list")
    private List<BrawlerDTO> list;
}
