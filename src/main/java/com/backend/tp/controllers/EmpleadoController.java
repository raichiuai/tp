package com.backend.tp.controllers;

import com.backend.tp.entities.Empleado;
import com.backend.tp.services.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpleadoController {
    @Autowired
    private EmpleadoService empleadoService;


    @PreAuthorize("hasRole('EMPLEADO')")
    @GetMapping("/pruebas/empleados")
    public List<Empleado> getAllEmpleados() {
        return empleadoService.getAll();
    }

}
