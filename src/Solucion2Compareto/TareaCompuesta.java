

import java.util.*;

public class TareaCompuesta extends Tarea {
	
	private List <Tarea> tareas;
	private int constante;
	
	public TareaCompuesta (int n, int cte,CoordinadorTareas ct) {
		super (n,ct);
		tareas = new ArrayList<Tarea>();
		constante = cte;
	}
	
	public void add(Tarea t) {
		tareas.add(t);
		Collections.sort(tareas);
	}
	
	public int getTiempoEjecucion() {
		int tiempo = 0;
		for (Tarea t: tareas) {
			tiempo += t.getTiempoEjecucion();
		}
		tiempo += constante;
		
		return tiempo;
	}

	public int getPrioridad() {
		int prioridad = 0;
		for (Tarea t: tareas) {
			prioridad += t.getPrioridad();
		}
		prioridad = (prioridad / tareas.size());
		
		return prioridad;
	}

	public void ejecutar() {
		this.estado = "Ejecutando";
		ct.notificarCambioEstado(this);
		for (Tarea t: tareas) {
			t.ejecutar();
		}
		this.estado = "Finalizada";
		ct.notificarCambioEstado(this);

	}
	public int compareTo(Tarea t) {
		Integer p = this.getPrioridad();
		return p.compareTo(t.getPrioridad());
	}

}
