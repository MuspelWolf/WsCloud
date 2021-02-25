package examen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import examen.modelo.entidad.Empleado;
import examen.modelo.entidad.Equipo;

@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class RaulGarciasanchezApplication {
	
	public static ApplicationContext context = null;

	public static void main(String[] args) {
		
		context = SpringApplication.run(RaulGarciasanchezApplication.class, args);
		
		
		
		Empleado e1 = context.getBean("empleado", Empleado.class);
		
		e1.setNombre("Raul");
		e1.setCompania("Indra");
		e1.getNomina().setSalario(480000);
		e1.getNomina().setFecha("12/02/2020");
		
		Empleado e2 = context.getBean("empleado", Empleado.class);
		e2.setNombre("Pedro");
		e2.setCompania("ING");
		e2.getNomina().setSalario(45000);
		e2.getNomina().setFecha("12/03/2021");
		
		System.out.println(e1);
		System.out.println(e2);
		
		Equipo eq1 = context.getBean("equipo1", Equipo.class);
		Equipo eq2 = context.getBean("equipo2", Equipo.class);
		
		System.out.println(eq1);
		System.out.println(eq2);
		
	}

}
