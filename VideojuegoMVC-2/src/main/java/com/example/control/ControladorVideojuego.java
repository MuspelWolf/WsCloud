package com.example.control;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.gestor.GestorVideojuego;
import com.example.model.Videojuego;


@Controller
public class ControladorVideojuego {
	
	@Autowired
	private GestorVideojuego gVJ;
	
	@GetMapping("lVideojuego")
	public String cargaLVideoJ(Model model) {
		
		ArrayList<Videojuego> lVideoJ = gVJ.cargarLista();
		model.addAttribute("lVideojuego", lVideoJ);
		
		
		return "vj";
		
	}

}

