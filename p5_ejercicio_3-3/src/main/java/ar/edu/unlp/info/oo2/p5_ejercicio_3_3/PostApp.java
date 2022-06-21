package ar.edu.unlp.info.oo2.p5_ejercicio_3_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class PostApp {
	
	private List<Post> posts;
	
	public List<Post> ultimosPosts(Usuario user, int cantidad) {
		return posts.stream()
				.filter(post -> !post.getUsuario().equals(user))
				.sorted(Comparator.comparing(Post::getFecha).reversed())
				.limit(cantidad).toList();
	}	
}
