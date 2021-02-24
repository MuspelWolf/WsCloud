package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Videojuego {

	
	@Id
	@GeneratedValue
	private int id;
	private String nombre;
	private String comp;
	private int precio;
	private int punt;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getComp() {
		return comp;
	}
	public void setComp(String comp) {
		this.comp = comp;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getPunt() {
		return punt;
	}
	public void setPunt(int punt) {
		this.punt = punt;
	}
	
	
}
