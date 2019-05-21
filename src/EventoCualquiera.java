
public class EventoCualquiera implements Evento {

	@Override
	public boolean cumple(Tarea t) {
		return true;
	}
	
	//este criterio significa que aceptamos el cambio de cualquier 
	//tarea. Entonces el hecho de que llegue una tarea al criterio
	//es porque cambió. Por eso devuelve True.
	
	//Resuelve el punto 1 de los "criterios"
	
}
