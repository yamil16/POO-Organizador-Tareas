
public class TareaSimple extends Tarea {
	private int tiempoEjecucion;
	private int prioridad;
	
	public TareaSimple (int nroTarea, int tiempo, int prioridad, CoordinadorTareas c) {
		super (nroTarea, c);
		tiempoEjecucion = tiempo;
		this.prioridad = prioridad;
	}
	
	
	public int getTiempoEjecucion() {
		return tiempoEjecucion;
	}

	public int getPrioridad() {
		return prioridad;
	}

	public void ejecutar() {
		this.estado = "Ejecutando";
		ct.notificarCambioEstado(this);
		this.estado = "Finalizada";
		ct.notificarCambioEstado(this);
	}
	public int compareTo(Tarea t) {
		if (prioridad < t.getPrioridad())
			return -1;
		else
			if (prioridad > t.getPrioridad())
				return 1;
			else
				return 0;
	}

}
