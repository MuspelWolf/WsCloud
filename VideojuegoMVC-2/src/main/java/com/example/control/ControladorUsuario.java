package com.example.control;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.gestor.GestorUsuario;
import com.example.model.Usuario;

import java.util.List;


@Controller
public class ControladorUsuario {
	
	@Autowired
	private GestorUsuario gUsu;
	
	@PostMapping("login")
	public String logIn(
			@RequestParam("nombre_usuario") String nombre,
			@RequestParam("password") String password,
			Model model) {
		
		Usuario u = new Usuario();
		u.setNombre(nombre);
		u.setPassword(password);
		
		boolean validar = gUsu.validarUsu(u);
		
		if(validar) {
			
			model.addAttribute("nombreUsu", nombre);
			
			List<Usuario> lUsu = new ArrayList<>();
			Usuario u1 = new Usuario();
			u1.setNombre("Raul");
			u1.setPassword("12345");
			
			lUsu.add(u1);
			
			model.addAttribute("lista", lUsu);
			
			return "vj";	
		}else return "error";
	}
}
