package Ejercicio2;

public abstract class Publicacion {

	//Atributos
	private String codigo;
	private String titulo;
	private int añoPublicacion;

	//Constructores
	public Publicacion(String codigo, String titulo, int añoPublicacion) {

		this.codigo = codigo;
		this.titulo = titulo;
		this.añoPublicacion = añoPublicacion;

	}

	//Metodos

	public int getAñoPublicacion() {

		return this.añoPublicacion;
	}

	public String getCodigo() {

		return this.codigo;
	}
	
	@Override
	public String toString() {
		
		return "Codigo: " + codigo + " Titulo: " + titulo + " Año publicacion: " + añoPublicacion;
	}

}