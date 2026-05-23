package com.fon.student_tracker.service;

import com.fon.student_tracker.domain.Smer;
import com.fon.student_tracker.repository.SmerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SmerService {
    private final SmerRepository smerRepository;

    public Smer create(Smer smer) {
        Smer saved =  smerRepository.save(smer);
        return saved;
    }
}
