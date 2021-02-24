package com.example.modelo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Libro {
	
	private String isbn;
	private String editorial;
	@Autowired
	@Qualifier("autor")
	private Autor autor;
	
	
	
	
	
	
	public Libro(String isbn, String editorial, Autor autor) {
		super();
		this.isbn = isbn;
		this.editorial = editorial;
		this.autor = autor;
	}
	
	public Libro() {
		super();
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", editorial=" + editorial + ", autor=" + autor + "]";
	}
	
	
}
