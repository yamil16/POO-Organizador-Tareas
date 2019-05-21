
public class EventoMayor implements Evento {
	private int tiempo;
	
	public EventoMayor (int t) {
		tiempo = t;
	}
		
	@Override
	public boolean cumple(Tarea t) {
		return (t.getTiempoEjecucion() > tiempo);
	}

	//Es el evento que sirve para notificar cuando una tarea
	//con un tiempo de ejecucion mayor a un X dado cambia
	
	//Resuelve el punto 6 de los "criterios"

}
