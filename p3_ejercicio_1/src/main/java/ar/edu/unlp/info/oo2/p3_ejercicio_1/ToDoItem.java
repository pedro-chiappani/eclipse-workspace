package ar.edu.unlp.info.oo2.p3_ejercicio_1;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem {
	
	private State state;
	private LocalDateTime fechaInicio, fechaFinal;
	private List<String> comentarios;
	
	public ToDoItem(String name) {
		this.state = new Pending();
		comentarios = new ArrayList<String>();
	}
	
	public LocalDateTime getFechaInicio() {
		return this.fechaInicio;
	}
	
	public LocalDateTime getFechaFinal() {
		return this.fechaFinal;
	}
	
	public void start() {
		this.state.comienzo(this);
	}
	
	public void comenzar() {
		this.state = new InProgress();
		this.fechaInicio = LocalDateTime.now();
	}
	
	public void togglePause() {
		this.state.pauso(this);
	}
	
	public void pausar() {
		this.state = new Paused();	
	}
	
	public void reanudar() {
		this.state = new InProgress();
	}
	
	public void finish() {
		this.state.termino(this);
	}
	
	public void terminar() {
		this.state = new Finished();
		this.fechaFinal = LocalDateTime.now();
	}
	
	public Duration workedTime() {
		return this.state.tiempoTrabajado(this);
	}
	
	public void addComent(String comment) {
		this.state.agregarComentario(this, comment);
	}
	
	public void agregarComentario(String comentario) {
		this.comentarios.add(comentario);
	}
}
