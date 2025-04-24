package com.hospital.citasmedicas.model;

import java.time.LocalDate;
import java.time.LocalTime;

//import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CitaMedica {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate fecha;
    private LocalTime hora;
    private String motivo;
    private String estado;

    @ManyToOne
    //@JsonBackReference
    private Paciente paciente;

    @ManyToOne
    //@JsonBackReference
    private Medico medico;
}
