

public class EventoTareaEstado implements Evento {
	private int nroTarea;
	private String estado;
	
	public EventoTareaEstado (int n, String e) {
		nroTarea = n;
		estado = e;
	}
	
	@Override
	public boolean cumple(Tarea t) {
		return (nroTarea == t.getNroTarea() && estado == t.getEstado());
	}
	
	//Es el evento que sirve para notificar cuando una
	//cierta tarea N cambia a un estado X especifico.

	//Resuelve el punto 3 de los "criterios"
}
