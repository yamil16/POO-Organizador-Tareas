
public abstract class Tarea implements ITarea {
	protected int nroTarea;
	protected String estado;
	protected CoordinadorTareas ct;
	
	public Tarea (int n, CoordinadorTareas c) {
		nroTarea = n;
		ct = c;
		estado = "Preparada";
	}
	
	public int getNroTarea () {
		return nroTarea;
	}
	
	public String getEstado () {
		return estado;
	}
	
	public boolean equals (Object o) {
		Tarea t = (Tarea) o;
		return (t.getNroTarea() == nroTarea);
	}
	
	public abstract int getTiempoEjecucion ();
	
	public abstract int getPrioridad ();
	
	public abstract void ejecutar ();
	
}
