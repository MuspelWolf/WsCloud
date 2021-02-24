package com.example.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Videojuego;




@Repository
public interface DaoVideojuego extends JpaRepository<Videojuego, Integer> {
	
	public Videojuego findByNombre(String nombre);

}
