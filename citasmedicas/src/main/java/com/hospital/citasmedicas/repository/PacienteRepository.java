package com.hospital.citasmedicas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.citasmedicas.model.Paciente;

public interface PacienteRepository extends JpaRepository <Paciente,Long>{
    
}
