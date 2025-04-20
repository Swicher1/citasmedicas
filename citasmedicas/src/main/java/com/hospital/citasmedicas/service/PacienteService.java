package com.hospital.citasmedicas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.citasmedicas.model.Paciente;
import com.hospital.citasmedicas.repository.PacienteRepository;

@Service
public class PacienteService {
    
     @Autowired
    private final PacienteRepository pacienteRepository;

    public PacienteService(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    public Paciente registrarPaciente(Paciente paciente) {
        if (paciente.getDni() == null || paciente.getDni().isBlank()) {
            throw new IllegalArgumentException("El DNI es obligatorio");
        }
        return pacienteRepository.save(paciente);
    }

    public List<Paciente> obtenerTodos() {
        return pacienteRepository.findAll();
    }
}
