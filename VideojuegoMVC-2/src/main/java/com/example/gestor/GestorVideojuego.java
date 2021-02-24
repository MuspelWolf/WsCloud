package com.example.gestor;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Videojuego;
import com.example.persistencia.DaoVideojuego;


@Service
public class GestorVideojuego {
	
	@Autowired
	DaoVideojuego dVJ;
	
	public ArrayList<Videojuego> cargarLista() {
		
		ArrayList<Videojuego> lVideoJ = new ArrayList<Videojuego>();
		lVideoJ = (ArrayList<Videojuego>) dVJ.findAll();
		
		return lVideoJ;
	}
	
	public Videojuego cargarVideoJ(int id) {
		
		Optional<Videojuego> optVJ = dVJ.findById(id);
		
		if(optVJ.isPresent()) return optVJ.get();
		else return null;
	}
	
	
}

