package Ejercicio2;

public abstract class Publicacion {

	//Atributos
	private String codigo;
	private String titulo;
	private int a�oPublicacion;

	//Constructores
	public Publicacion(String codigo, String titulo, int a�oPublicacion) {

		this.codigo = codigo;
		this.titulo = titulo;
		this.a�oPublicacion = a�oPublicacion;

	}

	//Metodos

	public int getA�oPublicacion() {

		return this.a�oPublicacion;
	}

	public String getCodigo() {

		return this.codigo;
	}
	
	@Override
	public String toString() {
		
		return "Codigo: " + codigo + " Titulo: " + titulo + " A�o publicacion: " + a�oPublicacion;
	}

}