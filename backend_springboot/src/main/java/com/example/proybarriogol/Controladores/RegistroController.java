package com.example.proybarriogol.Controladores;

import com.example.proybarriogol.Entidades.Registro;
import com.example.proybarriogol.Repositorios.RegistroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/registro")
public class RegistroController {

    @Autowired
    private RegistroRepository registroRepository;

    // Registrar un nuevo usuario
    @PostMapping("/registrar")
    public Registro registrarUsuario(@RequestBody Registro registro) {
        return registroRepository.save(registro);  
    }

    // Iniciar sesión
    @PostMapping("/iniciar")
    public ResponseEntity<String> iniciarSesion(@RequestBody Registro loginRequest) {
        // Utilizar el repositorio para buscar por correo y contraseña
        Optional<Registro> usuario = registroRepository.findByCorreoAndContraseña(
                loginRequest.getCorreo(), loginRequest.getContraseña());

        if (usuario.isPresent()) {
            return ResponseEntity.ok("Inicio sesion OK");
        } else {
            return ResponseEntity.status(404).body("Correo o contraseña incorrectos");
        }
    }

    // Obtener usuario por documento
    @GetMapping("/{documento}")
    public Optional<Registro> obtenerUsuarioPorDocumento(@PathVariable String documento) {
        return registroRepository.findByDocumento(documento); // Busca al usuario por documento
    }



}
