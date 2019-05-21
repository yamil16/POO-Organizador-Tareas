

import java.util.*;

public class Interesado {
	private List <Evento> suscripciones;
	private List <String> notificaciones;
	
	public Interesado () {
		suscripciones = new ArrayList <Evento>();
		notificaciones = new ArrayList <String>();
	}
	
	public void add (Evento e) {
		suscripciones.add(e);
	}
	
	public void notificar (Tarea t) {
		for (Evento e: suscripciones) {
			if (e.cumple(t)) {
				//hay que aceptar la notificacion
				StringBuffer notificacion = new StringBuffer ("Tarea: ");
				notificacion.append(t.getNroTarea() + ", Estado: ");
				notificacion.append (t.getEstado() + ", Tiempo: ");
				notificacion.append(t.getTiempoEjecucion());
				
				notificaciones.add(notificacion.toString());
				System.out.print(notificacion.toString());
				
				return;
			}
		}
	}
	//si el evento de la tarea se encuentra en alguna de las
	//suscripciones que nos interesa, aceptamos la notificacion
	//(La agrega a la lista y de paso la imprime como se pide)
}
