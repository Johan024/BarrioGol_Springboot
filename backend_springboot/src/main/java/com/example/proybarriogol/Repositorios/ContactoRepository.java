package com.example.proybarriogol.Repositorios;

import com.example.proybarriogol.Entidades.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactoRepository extends JpaRepository<Contacto, Integer> {
}
