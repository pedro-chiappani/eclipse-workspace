package ar.edu.unlp.info.oo2.ejercicio_3;

public class VideoStreamAdapter implements Media{
	
	private VideoStream videoStream;
	
	public void play() {
		this.videoStream.reproduce();
	}

}
