package Ejercicio2;

public class Revistas extends Publicacion {

	int  numero;	
	
	public Revistas (String codigo, String titulo, int a�oPublicacion, int numero) {
		
		super(codigo,titulo,a�oPublicacion);
		this.numero = numero;
		
	}
	
	public String toString() {
		
		return super.toString();
	}
}
