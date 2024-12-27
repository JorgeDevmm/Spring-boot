package com.example.ExamenSpringBoot.services;

import com.example.ExamenSpringBoot.entity.Empleado;
import com.example.ExamenSpringBoot.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    public List<Empleado> findAll() {
        return empleadoRepository.findAll();
    }

    public Empleado save(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    public Empleado update(int id, Empleado empleado) {
        empleado.setId(id);
        return empleadoRepository.save(empleado);
    }

    public void delete(int id) {
        empleadoRepository.deleteById(id);
    }
}
