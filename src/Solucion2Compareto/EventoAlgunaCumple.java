

import java.util.*;

public class EventoAlgunaCumple implements Evento {
	private List <Tarea> tareas;
	private Evento e;
	
	public EventoAlgunaCumple (Evento e) {
		tareas = new ArrayList <Tarea>();
		this.e = e;
	}
	
	public void add (Tarea t) {
		tareas.add(t);
	}
	
	@Override
	public boolean cumple (Tarea t) {
		return (tareas.contains(t) && e.cumple(t));
	}
	
	//este criterio permite notificar un evento cuando surja un 
	//cambio en alguna de las tareas especificadas en la lista
		
	//Resuelve el punto 4 y 5 de los "criterios", al ser generico
	//y evaluar que la tarea sea alguna de la que nos interesa y 
	//ademas cumpla el criterio. Se puede combinar con otros.
}
