package ar.edu.unlp.info.oo2.p3_ejercicio_1;

import java.time.Duration;
import java.time.LocalDateTime;

public class Pending implements State{

	@Override
	public void comienzo(ToDoItem item) {
		item.comenzar();
	}

	@Override
	public void pauso(ToDoItem item) {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
	}

	@Override
	public void termino(ToDoItem item) {
	}

	@Override
	public Duration tiempoTrabajado(ToDoItem item) {
		return Duration.between(item.getFechaInicio(), LocalDateTime.now());
	}

	@Override
	public void agregarComentario(ToDoItem item, String comment) {
		item.agregarComentario(comment);
	}

}
