package com.fon.student_tracker.controller;

import com.fon.student_tracker.domain.Smer;
import com.fon.student_tracker.service.SmerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/smer")
public class SmerController {
    private final SmerService smerService;

    @PostMapping("/api/smer")
    public Smer create(@RequestBody Smer smer) {
        return smerService.create(smer);
    }
}
