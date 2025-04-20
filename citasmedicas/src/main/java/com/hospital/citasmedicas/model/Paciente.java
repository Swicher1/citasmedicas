package com.hospital.citasmedicas.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Paciente {
  
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String nombres;
    private String dni;
    private LocalDate fechaNacimiento;
    private String contacto;

    @OneToMany(mappedBy = "paciente")
    private List<CitaMedica> citas;
}
