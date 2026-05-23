package com.fon.student_tracker.service;

import com.fon.student_tracker.domain.Modul;
import com.fon.student_tracker.domain.Smer;
import com.fon.student_tracker.dto.ModulRequest;
import com.fon.student_tracker.dto.ModulResponse;
import com.fon.student_tracker.dto.SmerRequest;
import com.fon.student_tracker.dto.SmerResponse;
import com.fon.student_tracker.repository.ModulRepository;
import com.fon.student_tracker.repository.SmerRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class ModulService {
    private final ModulRepository modulRepository;
    private final SmerService smerService;

    public ModulResponse create(@Valid ModulRequest modulRequest){
        Modul saved = modulRepository.save(Modul.from(modulRequest.naziv(),smerService.findByIdInternal(modulRequest.smerId())));
        return ModulResponse.from(saved);
    }

    public List<ModulResponse> findAll(){
        return ModulResponse.from(modulRepository.findAll());
    }
}
