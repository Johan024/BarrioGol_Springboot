package com.example.proybarriogol.Servicios;

import com.example.proybarriogol.Entidades.Contacto;
import com.example.proybarriogol.Repositorios.ContactoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactoService {

    @Autowired
    private ContactoRepository contactoRepository;

    public Contacto registrarContacto(Contacto contacto) {
        return contactoRepository.save(contacto);
    }

    public Contacto obtenerContactoPorId(Integer id) {
        return contactoRepository.findById(id).orElse(null);
    }
}
