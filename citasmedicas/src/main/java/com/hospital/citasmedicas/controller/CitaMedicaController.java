package com.hospital.citasmedicas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.citasmedicas.model.CitaMedica;
import com.hospital.citasmedicas.service.CitaMedicaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api/citasmedicas")
public class CitaMedicaController {

    @Autowired
    private CitaMedicaService citaMedicaService;

    @PostMapping("/guardar")
    public ResponseEntity<CitaMedica>registrarCitaMedica(@RequestBody CitaMedica citaMedica){
        CitaMedica guardado=citaMedicaService.registrarCitaMedica(citaMedica);
        return ResponseEntity.ok(guardado);
    }

    @GetMapping("/listar")
    public ResponseEntity <List<CitaMedica>> obtenerCitasMedicas() {
        return ResponseEntity.ok(citaMedicaService.obtenerTodos());
    }
    
}
