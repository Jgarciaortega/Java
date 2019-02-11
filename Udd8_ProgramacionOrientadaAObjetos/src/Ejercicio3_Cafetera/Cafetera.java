package Ejercicio3_Cafetera;


//Constructores 

public class Cafetera {

	private int capacidadMaxima = 0;
	private int cantidadActual = 0;

	public Cafetera() {

		this(1000, 0);//Se inicializan los otros constructores sobrecargando la función
		//this.capacidadMaxima =1000;
		//this.cantidadActual = 0;

	}

	public Cafetera (int capacidadMaxima) {
		
		this(capacidadMaxima,capacidadMaxima);
		
		//this.cantidadActual = capacidadMaxima;

	}


	public Cafetera (int capacidadMaxima , int cantidadActual) {
		
		this.capacidadMaxima = capacidadMaxima;
		this.cantidadActual = cantidadActual;

		if (cantidadActual > capacidadMaxima) {

			this.capacidadMaxima = cantidadActual; 
		}

		
	}

	//Getters y Setters

	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	public int getCantidadActual() {
		return cantidadActual;
	}

	public void setCantidadActual(int cantidadActual) {
		this.cantidadActual = cantidadActual;
	}



	//MÉTODOS 

	public int agregarCafe(int cantidad) {


		this.cantidadActual += cantidad;

		if (cantidadActual > capacidadMaxima) {

			cantidadActual = capacidadMaxima;
		}

		return this.cantidadActual;
	}

	public int vaciarCafetera() {

		cantidadActual = 0;

		return cantidadActual;

	}


	public int servirTaza(int cantidad) {

		this.cantidadActual -= cantidad;

		if (cantidadActual < 0) {

			cantidadActual = 0;
		}

		return cantidadActual;


	}

	public int llenarCafetera() {

		cantidadActual = capacidadMaxima;

		return cantidadActual;
	}


}
