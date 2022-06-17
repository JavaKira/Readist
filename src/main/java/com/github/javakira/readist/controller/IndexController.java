package com.github.javakira.readist.controller;

import com.github.javakira.readist.service.ReadSessionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    private final ReadSessionService readSessionService;

    public IndexController(ReadSessionService readSessionService) {
        this.readSessionService = readSessionService;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("readSessions", readSessionService.getAll());
        return "index";
    }
}
