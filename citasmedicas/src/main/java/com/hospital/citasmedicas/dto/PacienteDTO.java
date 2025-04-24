package com.hospital.citasmedicas.dto;

import java.time.LocalDate;

public class PacienteDTO {
    private Long id;
    private String nombres;
    private String dni;
    private LocalDate fechaNacimiento;
    private String contacto;

    public PacienteDTO(Long id, String nombres, String dni, LocalDate fechaNacimiento, String contacto) {
        this.id = id;
        this.nombres = nombres;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.contacto = contacto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
}
