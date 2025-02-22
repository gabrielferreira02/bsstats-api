package com.gabrielferreira02.bsstats.client;

import com.gabrielferreira02.bsstats.dto.BrawlerDTO;
import com.gabrielferreira02.bsstats.dto.GetBrawlersDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "brawler-service", url = "https://api.brawlify.com/v1/brawlers")
public interface BrawlerClient {

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    GetBrawlersDTO getBrawlers();

    @GetMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    BrawlerDTO getBrawlerById(@PathVariable("id") Long id);
}
