package com.fon.student_tracker.dto;

import com.fon.student_tracker.domain.Smer;

import java.util.ArrayList;
import java.util.List;

public record SmerResponse(Long id, String naziv) {
    public static SmerResponse from(Smer smer) {
        return new SmerResponse(smer.getId(),smer.getNaziv());
    }

    public static List<SmerResponse> from(List<Smer> smerovi) {
        List<SmerResponse> smerResponseList = new ArrayList<>();
        for (Smer smer : smerovi) {
            smerResponseList.add(SmerResponse.from(smer));
        }
        return smerResponseList;
    }
}
