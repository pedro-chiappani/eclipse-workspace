package ar.edu.unlp.info.oo2.p3_ejercicio_1;

import java.time.Duration;

public interface State {

	public abstract void comienzo(ToDoItem item);
	public abstract void pauso(ToDoItem item);
	public abstract void termino(ToDoItem item);
	public abstract Duration tiempoTrabajado(ToDoItem item);
	public abstract void agregarComentario(ToDoItem item, String comment);
}
