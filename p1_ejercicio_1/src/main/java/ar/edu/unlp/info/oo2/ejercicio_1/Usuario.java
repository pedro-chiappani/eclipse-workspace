package ar.edu.unlp.info.oo2.ejercicio_1;

import java.util.*;

public class Usuario {

	
	private List<Tweet> tweets;
	private String screenName;
	
	public Usuario (String username){
		tweets = new ArrayList<Tweet>();
		this.screenName = username;
	}
	
	public String getScreenName (){
		return this.screenName;
	}
	
	private Boolean esValido(String cuerpo) {
		return (0 < cuerpo.length() && cuerpo.length() < 140);
	}
	
	public Tweet publicarTweet (String cuerpo) {
		if (this.esValido(cuerpo)) {
			Tweet tw = new Tweet(cuerpo);
			tweets.add(tw);
			return tw;
		}
		else {
			System.out.println("El tweet no es valido");
			return null;
		}
	}
	
	public ReTweet reTweet(Tweet tuit) {
		ReTweet rt = tuit.reTweet();
		tweets.add(rt);
		return rt;
	}
	
	public int tweetsSize() {
		return tweets.size();
	}
}
