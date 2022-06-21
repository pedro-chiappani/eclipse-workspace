package ar.edu.unlp.info.oo2.p5_ejercicio_3_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PostApp {
	
	private Post[] posts;
	
	private List<Post> postsOtrosUsuarios(Usuario user){
		List<Post> postsOtrosUsuarios = new ArrayList<Post>();
    	for (Post post : this.posts) {
    		if (!post.getUsuario().equals(user)) {
    			postsOtrosUsuarios.add(post);
    		}
    	}
    	 return postsOtrosUsuarios;
	}

	public List<Post> ultimosPosts(Usuario user, int cantidad) {
		List<Post> postsOtrosUsuarios = this.postsOtrosUsuarios(user);
		   // ordena los posts por fecha
		   for (int i = 0; i < postsOtrosUsuarios.size(); i++) {
		       int masNuevo = i;
		       for(int j= i +1; j < postsOtrosUsuarios.size(); j++) {
		           if (postsOtrosUsuarios.get(j).getFecha().isAfter(
		     postsOtrosUsuarios.get(masNuevo).getFecha())) {
		              masNuevo = j;
		           }    
		       }
		      Post unPost = postsOtrosUsuarios.set(i,postsOtrosUsuarios.get(masNuevo));
		      postsOtrosUsuarios.set(masNuevo, unPost);    
		   }
		        
		    List<Post> ultimosPosts = new ArrayList<Post>();
		    int index = 0;
		    Iterator<Post> postIterator = postsOtrosUsuarios.iterator();
		    while (postIterator.hasNext() &&  index < cantidad) {
		        ultimosPosts.add(postIterator.next());
		    }
		    return ultimosPosts;
		}


}
