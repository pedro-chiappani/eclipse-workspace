package ar.edu.unlp.info.oo2.p3_ejercicio_1;

import java.time.Duration;
import java.time.LocalDateTime;

public class InProgress implements State {

	@Override
	public void comienzo(ToDoItem item) {
	}

	@Override
	public void pauso(ToDoItem item) {
		item.pausar();
	}

	@Override
	public void termino(ToDoItem item) {
		item.terminar();
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
