package examen.modelo.entidad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")
public class Empleado {
	
	private String nombre;
	private String compania;
	
	@Autowired
	private Nomina nomina;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	public Nomina getNomina() {
		return nomina;
	}

	public void setNomina(Nomina nomina) {
		this.nomina = nomina;
	}

	@Override
	public String toString() {
		return "Empleado \tNombre:" + nombre + "\n\t\tCompañia:" + compania + "\n\t\tNomina:" + nomina;
	}
}
