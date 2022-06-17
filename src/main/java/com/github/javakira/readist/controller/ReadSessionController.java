package com.github.javakira.readist.controller;

import com.github.javakira.readist.dto.ReadSessionDto;
import com.github.javakira.readist.entity.ReadSession;
import com.github.javakira.readist.service.ReadSessionService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class ReadSessionController {
    private final ReadSessionService readSessionService;

    public ReadSessionController(ReadSessionService readSessionService) {
        this.readSessionService = readSessionService;
    }

    @PostMapping("{id}")
    public String getReadSession(@PathVariable long id) {
        return readSessionService.get(id).getId().toString();
    }

    @PostMapping(path = "/add", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addReadSession(@RequestBody ReadSessionDto readSession) {
        readSessionService.save(new ReadSession(readSession));
    }
}
