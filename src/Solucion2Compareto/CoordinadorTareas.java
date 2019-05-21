

import java.util.*;

public class CoordinadorTareas {
	private List <Interesado> interesados;
	private int eventos;
	
	public CoordinadorTareas () {
		interesados = new ArrayList <Interesado> ();
		eventos = 0;
	}
	public void add (Interesado i) {
		interesados.add(i);
	}
	
	public void notificarCambioEstado (Tarea t) {
		for (Interesado i: interesados) {
			i.notificar(t);
		}
		eventos++;
	}
	
	public int getCantidadEventos () {
		return eventos;
	}
}
