package com.hospital.citasmedicas.dto;

public class MedicoDto {
    private Long id;
    private String nombre;
    private String especialidad;
    private String cmp;

    public MedicoDto(Long id, String nombre, String especialidad, String cmp) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cmp = cmp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getCmp() {
        return cmp;
    }

    public void setCmp(String cmp) {
        this.cmp = cmp;
    }
}
