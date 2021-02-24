package com.example.gestor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Usuario;
import com.example.persistencia.DaoUsuario;


@Service
public class GestorUsuario {
	@Autowired
	private DaoUsuario dUsu;
	
	public boolean validarUsu(Usuario usuario) {
		
		Usuario uAux = dUsu.findByNombreAndPassword(usuario.getNombre(), 
				usuario.getPassword());
		
		if(uAux == null) return false;
		else return true;
		
	}
	

}
