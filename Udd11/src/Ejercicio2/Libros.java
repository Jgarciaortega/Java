package Ejercicio2;

public class Libros extends Publicacion implements Prestable {

	//Atributos
	boolean prestado;
	
	//Constructores
	public Libros(String codigo, String titulo, int añoPublicacion) {
		
		super(codigo, titulo, añoPublicacion);
		this.prestado = false;
		
	}

	@Override
	public void prestar() {
		
		this.prestado = true;
	}

	@Override
	public void devolver() {
		
		this.prestado = false;
	}
	
	public String toString() {
		
		return super.toString();
	}
	

}
