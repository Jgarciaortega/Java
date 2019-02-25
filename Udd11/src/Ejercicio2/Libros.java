package Ejercicio2;

public class Libros extends Publicacion implements Prestable {

	//Atributos
	boolean prestado;
	
	//Constructores
	public Libros(String codigo, String titulo, int a�oPublicacion) {
		
		super(codigo, titulo, a�oPublicacion);
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
