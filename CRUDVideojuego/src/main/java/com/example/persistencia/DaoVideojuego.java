package com.example.persistencia;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.modelo.Videojuego;


@Component
public class DaoVideojuego {

	private List<Videojuego> lVj;

	private int cont = 1;

	public DaoVideojuego() {
		
		Videojuego vj1 = new Videojuego();
		vj1.setId(cont++);
		vj1.setNombre("Sony");
		vj1.setCompania("Sega");
		vj1.setPrecio(15.50);
		vj1.setPuntuacion(8);
		
		Videojuego vj2 = new Videojuego();
		vj2.setId(cont++);
		vj2.setNombre("Fortnite");
		vj2.setCompania("Epic Games");
		vj2.setPrecio(49.50);
		vj2.setPuntuacion(5);
		

		lVj = new ArrayList<Videojuego>();
		lVj.add(vj1);
		lVj.add(vj2);
	} 
	

	public List<Videojuego> list() {
		return lVj;
	}

	public Videojuego buscar(int id) {
		Videojuego vj = null;
		for (Videojuego videojuego : lVj) {
			if(videojuego.getId() == id) {
				vj = videojuego;
				break;
			}
		}
	
		return vj;
	}
	

	public Videojuego create(Videojuego vj) {
		vj.setId(cont++);
		lVj.add(vj);
		return vj;

	}


	public Videojuego update(Videojuego vjUpt) {
		
		Videojuego vj = buscar(vjUpt.getId());

		
		if (vj != null) {
			vj.setNombre(vjUpt.getNombre());
			vj.setCompania(vjUpt.getCompania());
			vj.setPrecio(vjUpt.getPrecio());
			vj.setPuntuacion(vjUpt.getPuntuacion());
			
		}
		return vj;
	}
	

	public Videojuego delete(int id) {
		Videojuego vj = buscar(id);

		if (vj != null) {
			lVj.remove(id);

		}
		return vj;

	}
}
