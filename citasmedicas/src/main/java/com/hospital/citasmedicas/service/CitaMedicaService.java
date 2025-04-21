package com.hospital.citasmedicas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.citasmedicas.model.CitaMedica;
import com.hospital.citasmedicas.repository.CitaMedicaRepository;

@Service
public class CitaMedicaService {

    @Autowired
    private final CitaMedicaRepository citaMedicaRepository;

    public CitaMedicaService(CitaMedicaRepository citaMedicaRepository){
            this.citaMedicaRepository=citaMedicaRepository;
    }

    public CitaMedica registrarCitaMedica(CitaMedica citaMedica){
        return citaMedicaRepository.save(citaMedica);
    }

    public List<CitaMedica> obtenerTodos(){
        return citaMedicaRepository.findAll();
   }

}
