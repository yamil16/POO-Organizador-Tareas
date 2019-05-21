

public class EventoTareaCambia implements Evento{
	private int nroTarea;
	
	public EventoTareaCambia (int n) {
		nroTarea = n;
	}
	
	@Override
	public boolean cumple(Tarea t) {
		return (nroTarea == t.getNroTarea());
	}
	
	//Es el evento que sirve para notificar cuando 
	//una cierta tarea N cambia de estado.
	
	//Resuelve el punto 2 de los "criterios"

}
