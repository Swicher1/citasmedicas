package com.hospital.citasmedicas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.citasmedicas.model.Medico;
import com.hospital.citasmedicas.repository.MedicoRepository;

@Service
public class MedicoService {

    @Autowired
    private final MedicoRepository medicoRepository;

    public MedicoService(MedicoRepository medicoRepository){
         this.medicoRepository=medicoRepository;
    }

    public Medico registrarMedico(Medico medico){
        return medicoRepository.save(medico);
    }

    public List <Medico>obtenerTodos(){
        return medicoRepository.findAll();
    }
}
