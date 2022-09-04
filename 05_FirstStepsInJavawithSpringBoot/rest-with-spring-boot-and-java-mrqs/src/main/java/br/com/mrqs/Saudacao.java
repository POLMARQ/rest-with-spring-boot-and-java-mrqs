/*
 * - para criar um construtor:
 * 		* alt + shift + s  -> Generate Constructor using Fields...
 * 		*
 * */

package br.com.mrqs;

public class Saudacao {
	
	private final int id;
	private final String comentario;
	public Saudacao(int id, String comentario) {		
		this.id = id;
		this.comentario = comentario;
	}
	public int getId() {
		return id;
	}
	public String getComentario() {
		return comentario;
	}
	
		
}
