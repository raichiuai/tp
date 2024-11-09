package com.backend.tp.controllers;

import com.backend.tp.entities.Empleado;
import com.backend.tp.services.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpleadoController {
    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping("/empleados")
    public List<Empleado> getAllEmpleados() {
        return empleadoService.getAll();
    }
}
