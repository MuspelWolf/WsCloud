package examen.modelo.entidad;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Jugador {
	
	private String nombre;
	private int dorsal;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDorsal() {
		return dorsal;
	}
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	@Override
	public String toString() {
		return "Nombre:" + nombre + "\tDorsal:" + dorsal;
	}
	
	

}
