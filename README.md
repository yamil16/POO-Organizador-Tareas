# Programación Orientada a objetos

a)
Diseñe un modelo orientado a objetos e implemente usando Java, para el dominio de un organizador de tareas.
Se organizan tareas que son identificadas con un numero. Las tareas pueden estar en estado "preparada", "ejecutando"o "finalizadas". Cuando una tarea es creada el estado inicial es "preparada", luego al pedirle que se ejecute pasa a "ejecutando". Inmediatamente despues de que una tarea finaliza su ejecución, su estado pasa a finalizada El tiempo de finalizacion de una tarea es fijo y se conoce de ante mano.
Ademas una tarea tiene una prioridad, que puede ser un valor entre 0 y 5.
Tambien hay tareas que poseen sub-tareas. Cuando una tarea con sub-tareas se le pide que se ejecute, esta establece un estado de ejecutando y ejecuta en orden sus tareas.
El orden queda establecido por la prioridad de la sub-tarea. Es el estado de una tarea con sub-tarea sera finalizado cuando la ultima de sus sub-tareas haya finalizado.
El tiempo total de ejecución de una tarea con sub-tarea es la suma de los tiempos de sus sub-tareas mas una constante igual a 8 segundos. La prioridad de una tarea con sub-tarea es el promedio de las prioridades de sus sub-tarea. 

Adicionalmente cada vez que cualquier tarea cambie de estado le informa a un "cordinador de tarea", indicando que esta tarea pasó a un nuevo estado. Luego el cordinado de tareas notifica estos cambios a quienes esten interesados. Para esto, previamente un interesado debe suscribirse al cordinador indicando el/los evento/s de los que desea recibir la notificación. El caso mas sencillo seria que un intresado desee recibir notificaciones relacionadas con una tarea especifica. Por ejemplo: Tarea: Nro. Tarea.

b) 
A partir de la implementación anterior realice lo necesario para que se pueda leer:
1) imprimir por pantalla: "Tarea"+nro. Tarea+"estado:"+EstadoTarea+"tiempo:"+TiempoTarea
2) Registrar la cantidad de eventos.
Cuando (para b1 y b2):
Una tarea N cambia de estado.
Una tarea N cambia a un estado especifico.
Cualquier tarea cambia de estado.
Alguna tareas incluidas en una lista cambian de estado (ejemplo tareas 2,3,4)
Alguna tareas incluidas en una lista cambian a un estado especifico (ejemplo tareas 2,5,9 cambia al estado ejecutando)
Una tarae cuyo tiempo es mayor de 15 y cambia de estado