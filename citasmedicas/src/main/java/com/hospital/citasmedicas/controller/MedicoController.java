package com.hospital.citasmedicas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.citasmedicas.model.Medico;
import com.hospital.citasmedicas.service.MedicoService;

@RestController
@RequestMapping("/api/medicos")
public class MedicoController {
    @Autowired
    private MedicoService medicoService;

    @PostMapping("/guardar")
    public ResponseEntity<Medico> registrarMedico(@RequestBody Medico medico) {

        Medico guardado = medicoService.registrarMedico(medico);
        return ResponseEntity.ok(guardado);
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Medico>> obtenerMedicos() {
        return ResponseEntity.ok(medicoService.obtenerTodos());
    }
}
