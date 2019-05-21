

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
		int i = 0;
		boolean insertado = false;
		while (i < tareas.size() && !insertado) {
			Tarea aux = tareas.get(i);
			if (aux.getPrioridad() <= t.getPrioridad()) {
				tareas.add(i, t);
				insertado = true;
			}
			i++;
		}
		if (!insertado)
			tareas.add(t);
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

}
