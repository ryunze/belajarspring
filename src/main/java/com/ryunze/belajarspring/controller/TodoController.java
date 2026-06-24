package com.ryunze.belajarspring.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.HashMap;

@RestController
@RequestMapping("/api/todos")
class TodoController {

    @GetMapping
    public Map<String, Object> getAll() {
        Map<String, Object> data = new HashMap<>();
        data.put("status", "ok");
        return data;
    }

}