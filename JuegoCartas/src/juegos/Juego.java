package juegos;

import barajas.Baraja;

public abstract class  Juego {

	//Atributos

	protected Baraja baraja;
	private String nombreJuego;
	protected String nombreJugador1;
	protected String nombreJugador2;
	protected double puntosJugador1;
	protected double puntosJugador2;
	protected int  numeroMano;
	protected String idioma;

	//Constructor
	public Juego(String nombre, String Idioma) {

		this.nombreJuego = nombre;
		this.idioma = Idioma;

	}

	//Metodos abstractos
	public abstract void jugar();


	//Metodos
	private void imprimirCabecera() {
		
		System.out.println("***********************************************");
		System.out.println("     JUEGOS DE CARTAS DAW DAW ");
		System.out.println("***********************************************");

	}

	public void imprimirFinJuego(String jugador, String ganaPierde) {
		
		System.out.println("");
		System.out.println("******FIN DEL JUEGO*******");
		System.out.println("**************************");
	

		if (jugador.equals("EMPATE")) {
			
			System.out.println("El resultado de la partida es EMPATE");
			
		}else {

			System.out.println("El jugador que ha ganado es " + jugador);
		}

		
		System.out.println("A continuacion se muestran las puntuaciones:");
		System.out.println("");
		imprimirPuntuacion();
		System.out.println("");
	}

	protected void imprimirPuntuacion() {

		System.out.println("Puntuacion " + this.nombreJugador1 +" es : " + this.puntosJugador1);
		System.out.println("Puntuacion " + this.nombreJugador2 +" es : " + this.puntosJugador2);

	}

	protected void sumarPuntosJugador(double puntosCarta1, double puntosCarta2, int numJugador) {

		this.puntosJugador1 += puntosCarta1;
		this.puntosJugador2 += puntosCarta2;
	}
}
