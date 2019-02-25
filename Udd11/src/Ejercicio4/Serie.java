package Ejercicio4;

public class Serie implements Entregable{

	//Atributos
	private String titulo;
	private int numTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	//Constructores
	public Serie() {
		
		this("null","null");
	}
	
	public Serie(String titulo,String creador) {
				
		this(titulo,3,"null",creador);		
	}
	
	public Serie(String titulo,int numTemporadas,String genero,String creador) {
		
		this.titulo = titulo;
		this.numTemporadas = numTemporadas;
		this.genero = genero;
		this.creador = creador;
		this.entregado = false;
	}

	
	//Metodos
	
	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumTemporadas() {
		return this.numTemporadas;
	}

	public void setNumTemporadas(int numTemporadas) {
		this.numTemporadas = numTemporadas;
	}


	public String getGenero() {
		return this.genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return this.creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	//Metodos interface
	@Override
	public void entregar() {
		this.entregado = true;		
	}

	@Override
	public void devolver() {
		this.entregado = false;		
	}

	@Override
	public boolean isEntregado() {		
		return this.entregado;
	}

	//
	public boolean compareTo(Videojuego videojuego) {
		
		boolean comparacion;
		
		if(videojuego.getHorasEstimadas() == this.numTemporadas) {
			
			comparacion = true;
			
		}else {
			
			comparacion = false;
		}
		return comparacion;
	}

	@Override
	public boolean compareTo(Object a) {
		
		Serie serie = (Serie) a;
		
		return (this.getNumTemporadas() < serie.numTemporadas);
	}

	
}
