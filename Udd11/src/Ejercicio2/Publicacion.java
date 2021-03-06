package Ejercicio2;

public abstract class Publicacion {

	//Atributos
	private String codigo;
	private String titulo;
	private int aņoPublicacion;

	//Constructores
	public Publicacion(String codigo, String titulo, int aņoPublicacion) {

		this.codigo = codigo;
		this.titulo = titulo;
		this.aņoPublicacion = aņoPublicacion;

	}

	//Metodos

	public int getAņoPublicacion() {

		return this.aņoPublicacion;
	}

	public String getCodigo() {

		return this.codigo;
	}
	
	@Override
	public String toString() {
		
		return "Codigo: " + codigo + " Titulo: " + titulo + " Aņo publicacion: " + aņoPublicacion;
	}

}