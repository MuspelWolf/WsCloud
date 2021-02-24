package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.model.Usuario;
import com.example.model.Videojuego;
import com.example.persistencia.DaoUsuario;
import com.example.persistencia.DaoVideojuego;


@SpringBootApplication
public class VideojuegoMvc2Application {

	public static void main(String[] args) {
ApplicationContext context = SpringApplication.run(VideojuegoMvc2Application.class, args);
		
		
		DaoUsuario du = context.getBean("daoUsuario", DaoUsuario.class);
		DaoVideojuego dv = context.getBean("daoVideojuego", DaoVideojuego.class);
		
		Usuario u = new Usuario();
		u.setNombre("Pedro");
		u.setPassword("4567");
		du.save(u);
		
		Videojuego vj1 = new Videojuego();
		vj1.setNombre("Ori");
		vj1.setComp("EA");
		vj1.setPrecio(20);
		vj1.setPunt(10);
		dv.save(vj1);
		
		Videojuego vj2 = new Videojuego();
		vj2.setNombre("Minecraft");
		vj2.setComp("Mojang");
		vj2.setPrecio(15);
		vj2.setPunt(8);
		dv.save(vj2);
		}

}
