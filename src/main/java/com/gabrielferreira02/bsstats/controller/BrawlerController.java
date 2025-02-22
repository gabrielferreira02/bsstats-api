package com.gabrielferreira02.bsstats.controller;

import com.gabrielferreira02.bsstats.client.BrawlerClient;
import com.gabrielferreira02.bsstats.dto.BrawlerDTO;
import com.gabrielferreira02.bsstats.dto.GetBrawlersDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("brawlers")
public class BrawlerController {

    @Autowired
    private BrawlerClient brawlerClient;

    @GetMapping()
    public GetBrawlersDTO getBrawlers() {
        return brawlerClient.getBrawlers();
    }

    @GetMapping("{id}")
    public BrawlerDTO getBrawlerById(@PathVariable("id") Long id) {
        return brawlerClient.getBrawlerById(id);
    }
}
