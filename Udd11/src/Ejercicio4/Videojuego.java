package Ejercicio4;

public class Videojuego implements Entregable{

	//Atributos
	private String titulo;
	private int horasEstimadas;
	private boolean entregado;
	private String genero;
	private String companyia;

	//Constructores

	public Videojuego() {

		this("null",10);
	}

	public Videojuego(String titulo, int horasEstimadas) {

		this(titulo,10,"null","null");
	}

	public Videojuego(String titulo, int horasEstimadas, String genero, String companyia) {

		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.companyia = companyia;
	}

	//Metodos

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompanyia() {
		return companyia;
	}

	public void setCompanyia(String companyia) {
		this.companyia = companyia;
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

	@Override
	public boolean compareTo(Object a) {

		Videojuego videojuego = (Videojuego) a;

		return (this.horasEstimadas < videojuego.horasEstimadas) ;

	}

}

