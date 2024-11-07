package com.example.proybarriogol.Servicios;

import com.example.proybarriogol.Entidades.Registro;
import com.example.proybarriogol.Repositorios.RegistroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RegistroService {

    @Autowired
    private RegistroRepository registroRepository;

    // Método para registrar un usuario
    public Registro registrarUsuario(Registro registro) {
        return registroRepository.save(registro);
    }

    // Método para iniciar sesión
    public Optional<Registro> iniciarSesion(String correo, String contraseña) {
        return registroRepository.findByCorreoAndContraseña(correo, contraseña);
    }

    // Método para obtener un usuario por documento
    public Optional<Registro> obtenerUsuarioPorDocumento(String documento) {
        return registroRepository.findByDocumento(documento);  // Cambié findById por findByDocumento
    }
}
