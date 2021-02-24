package com.example.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.modelo.Videojuego;
import com.example.persistencia.DaoVideojuego;

@Controller
public class ControladorVideojuego {

	@Autowired
	private DaoVideojuego dVJ;
	

	@GetMapping("videojuegos")
	public ResponseEntity<List<Videojuego>> listar() {
		List<Videojuego> lVJ = dVJ.list();

		ResponseEntity<List<Videojuego>> re = new ResponseEntity<List<Videojuego>>(lVJ, HttpStatus.OK);

		return re;
	}

	
	@GetMapping("videojuegos/{id}")
	public ResponseEntity<Videojuego> obtener(@PathVariable("id") int id_vj) {
		System.out.println("El id a buscar es:" + id_vj);
		
		Videojuego vj1 = dVJ.buscar(id_vj);

		HttpStatus hStatus = null;
		if (vj1 != null) {
			hStatus = HttpStatus.OK;
		} else {
			hStatus = HttpStatus.NOT_FOUND;
		}
		ResponseEntity<Videojuego> re = new ResponseEntity<Videojuego>(vj1, hStatus);

		return re;
	}
	

	@PostMapping("videojuegos")
	public ResponseEntity<Videojuego> alta(@RequestBody Videojuego vj) {
		Videojuego nVJ = dVJ.create(vj);

		ResponseEntity<Videojuego> resEnt = new ResponseEntity<Videojuego>(nVJ, HttpStatus.CREATED);

		return resEnt;

	}
	
	@PutMapping("videojuegos/{id}")
	public ResponseEntity<Videojuego> update(@RequestBody Videojuego vj, @PathVariable("id") int id_vj) {
		
		vj.setId(id_vj);

		Videojuego vjUpt = dVJ.update(vj);

		HttpStatus hStatus = null;

		if (vjUpt != null) {
			hStatus = HttpStatus.OK;
		} else {
			hStatus = HttpStatus.NOT_FOUND;
		}

		ResponseEntity<Videojuego> reEnt = new ResponseEntity<Videojuego>(vjUpt, hStatus);

		return reEnt;

	}
	
	@DeleteMapping("videojuegos/{id}")
	public ResponseEntity<Videojuego> delete(@PathVariable("id") int id_vj) {

		Videojuego vjDel = dVJ.delete(id_vj);

		HttpStatus hStatus = null;


		if (vjDel != null) {
			hStatus = HttpStatus.OK;
		} else {
			hStatus = HttpStatus.NOT_FOUND;
		}

		ResponseEntity<Videojuego> resEnt = new ResponseEntity<Videojuego>(vjDel, hStatus);

		return resEnt;

	}
	
}
