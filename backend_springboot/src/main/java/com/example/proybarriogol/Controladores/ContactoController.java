package com.example.proybarriogol.Controladores;

import com.example.proybarriogol.Entidades.Contacto;
import com.example.proybarriogol.Servicios.ContactoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contacto")
public class ContactoController {

    @Autowired
    private ContactoService contactoService;

    @PostMapping("/crear")
    public Contacto registrarContacto(@RequestBody Contacto contacto) {
        return contactoService.registrarContacto(contacto);
    }

    @GetMapping("/{id}")
    public Contacto obtenerContactoPorId(@PathVariable Integer id) {
        return contactoService.obtenerContactoPorId(id);
    }
}
