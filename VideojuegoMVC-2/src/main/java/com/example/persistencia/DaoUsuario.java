package com.example.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Usuario;



@Repository
public interface DaoUsuario extends JpaRepository<Usuario, Integer> {
	
	public Usuario findByNombre(String nombre);
	
	public Usuario findByNombreAndPassword(String nombre, String password);
}
