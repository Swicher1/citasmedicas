package com.hospital.citasmedicas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.citasmedicas.model.Medico;

public interface MedicoRepository extends JpaRepository<Medico,Long> {

}
