package com.fon.student_tracker.dto;

import com.fon.student_tracker.domain.Modul;
import com.fon.student_tracker.domain.Smer;

import java.util.ArrayList;
import java.util.List;

public record ModulResponse(Long id, String naziv, SmerResponse smerResponse) {
    public static ModulResponse from(Modul modul) {
        return new ModulResponse(modul.getId(),modul.getNaziv(),SmerResponse.from(modul.getSmer()));
    }

    public static List<ModulResponse> from(List<Modul> moduli) {
        List<ModulResponse> listResponse = new ArrayList<>();
        for (Modul modul : moduli) {
            listResponse.add(ModulResponse.from(modul));
        }
        return listResponse;
    }
}
