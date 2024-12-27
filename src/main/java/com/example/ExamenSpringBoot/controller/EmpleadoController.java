package com.example.ExamenSpringBoot.controller;

import com.example.ExamenSpringBoot.entity.Empleado;
import com.example.ExamenSpringBoot.services.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/empleados")
public class EmpleadoController {
    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping
    public List<Empleado> getAll() {
        return empleadoService.findAll();
    }

    @PostMapping
    public Empleado create(@RequestBody Empleado empleado) {
        return empleadoService.save(empleado);
    }

    @PutMapping("/{id}")
    public Empleado update(@PathVariable int id, @RequestBody Empleado empleado) {
        return empleadoService.update(id, empleado);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        empleadoService.delete(id);
    }

}
