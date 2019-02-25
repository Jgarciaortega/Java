package Ejercicio2;

public class Revistas extends Publicacion {

	int  numero;	
	
	public Revistas (String codigo, String titulo, int añoPublicacion, int numero) {
		
		super(codigo,titulo,añoPublicacion);
		this.numero = numero;
		
	}
	
	public String toString() {
		
		return super.toString();
	}
}
