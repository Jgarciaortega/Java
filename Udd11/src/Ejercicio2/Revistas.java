package Ejercicio2;

public class Revistas extends Publicacion {

	int  numero;	
	
	public Revistas (String codigo, String titulo, int aņoPublicacion, int numero) {
		
		super(codigo,titulo,aņoPublicacion);
		this.numero = numero;
		
	}
	
	public String toString() {
		
		return super.toString();
	}
}
