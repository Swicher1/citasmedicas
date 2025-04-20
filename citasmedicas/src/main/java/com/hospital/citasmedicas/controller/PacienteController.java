package com.hospital.citasmedicas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.citasmedicas.model.Paciente;
import com.hospital.citasmedicas.service.PacienteService;

@RestController
@RequestMapping("/api/pacientes")
public class PacienteController {
     @Autowired
    private PacienteService pacienteService;

    @PostMapping("/guardar")
    public ResponseEntity<Paciente> registrarPaciente(@RequestBody Paciente paciente) {

        Paciente guardado = pacienteService.registrarPaciente(paciente);
        return ResponseEntity.ok(guardado);
    }

    // Listar todos los pacientes
    @GetMapping("/listar")
    public ResponseEntity<List<Paciente>> obtenerPacientes() {
        return ResponseEntity.ok(pacienteService.obtenerTodos());
    }

}
