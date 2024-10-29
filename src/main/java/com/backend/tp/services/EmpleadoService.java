package com.backend.tp.services;

import com.backend.tp.entities.Empleado;
import com.backend.tp.repositories.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService {
    @Autowired
    private EmpleadoRepository empleadoRepository;

    public List<Empleado> getAll(){
        return empleadoRepository.findAll();
    }
}
