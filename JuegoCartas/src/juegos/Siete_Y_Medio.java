package juegos;

import java.util.Scanner;

import barajas.Baraja;
import barajas.Carta;

public class Siete_Y_Medio extends Juego {


	private Baraja barajaEspañola;



	public Siete_Y_Medio(String nombre, String Idioma,int tipoBaraja) {

		super(nombre, Idioma);
		this.barajaEspañola = new Baraja (tipoBaraja,false);

	}

	@Override
	public void jugar() {

		String jugadorGanador = null;
		String jugadorPerdedor = null;
		String opc;
		Carta cartaRobada;
		Scanner sc = new Scanner(System.in);
		boolean tiradaPlayer1 = true;
		boolean tiradaPlayer2 = true;
		double carta1 = 0;
		double carta2 = 0;
		
		barajaEspañola.barajar();

		//ZONA JUGAR PARTIDA

		while(tiradaPlayer1 || tiradaPlayer2) {

			if (tiradaPlayer1) {
				cartaRobada = barajaEspañola.robar();
				System.out.print("Carta para " + super.nombreJugador1  + ":" + cartaRobada);
				carta1 = cartaRobada.getValor7yMedio();
			}

			if (tiradaPlayer2) {

				cartaRobada = barajaEspañola.robar();

				if(super.nombreJugador2.equals("CPU")) {

					//Si jugamos contra la CPU no podemos ver la carta que le ha salido
					System.out.println("CPU recibe su carta");

				}else {

					System.out.println("Carta para " + super.nombreJugador2 + ":" + cartaRobada);
				}

				carta2 = cartaRobada.getValor7yMedio();

			}

			//ZONA AVERIGUAR GANADOR

			sumarPuntosJugador(carta1, carta2, 2);
			jugadorGanador = asignaPuntos();

			if(super.nombreJugador2.equals("CPU")) {

			}else {

				imprimirPuntuacion();
			}

			if(super.puntosJugador1 > 7.5 || super.puntosJugador2 > 7.5) {

				break;
			}



			if (tiradaPlayer1) {

				tiradaPlayer1 = decisionTirada(super.nombreJugador1,super.puntosJugador1);
				carta1 = 0;

			}


			if (tiradaPlayer2) {

				tiradaPlayer2 = decisionTirada(super.nombreJugador2,super.puntosJugador2);
				carta2 = 0;

			}

		}

		imprimirFinJuego(jugadorGanador, jugadorPerdedor);
		System.out.println("¿Desea jugar otra partida s/n?");
		opc = sc.nextLine();
		
		if (opc.equals("s")) {
			
			super.puntosJugador1 = 0;
			super.puntosJugador2 = 0;
			jugar();
		}

	}


	public void setNomJugador(String Player1, String Player2) {

		super.nombreJugador1 = Player1;
		super.nombreJugador2 = Player2;

	}


	public double faltaHasta7yMedio(double puntos) {

		puntos = 7.5 - puntos;

		return puntos;
	}


	public boolean decisionTirada(String nombre,double puntos) {

		String opc;
		Scanner sc = new Scanner(System.in);
		boolean decision = false;

		if (nombre.equals("CPU")) {

			if (puntos <= 6) {

				decision = true;

			}else {

				decision = false;
			}


		}else {
			
			System.out.printf("\n");
			System.out.println("�" + nombre + " te plantas s/n?");		
			opc = sc.nextLine();
			if(opc.equals("n")) {

				decision = true;

			}else {

				decision = false;
			}

		}

		return decision;
	}

	public String asignaPuntos() {

		double puntosFaltan1;
		double puntosFaltan2;
		String jugadorGanador = null;
		String jugadorPerdedor = null;


		puntosFaltan1 = faltaHasta7yMedio(super.puntosJugador1);
		puntosFaltan2 = faltaHasta7yMedio(super.puntosJugador2);

		if(puntosFaltan2 < puntosFaltan1 && super.puntosJugador2 <= 7.5 || super.puntosJugador1 > 7.5) {

			jugadorGanador = super.nombreJugador2;
			jugadorPerdedor = super.nombreJugador1;

		} 
		if (puntosFaltan1 < puntosFaltan2 && super.puntosJugador1 <= 7.5 || super.puntosJugador2 > 7.5) {

			jugadorGanador = super.nombreJugador1;
			jugadorPerdedor = super.nombreJugador2;


		} 
		if (super.puntosJugador1 > 7.5 && super.puntosJugador2 > 7.5) {

			jugadorGanador = "EMPATE";
			jugadorPerdedor = "EMPATE ";

		}

		if(super.puntosJugador1 == super.puntosJugador2) {

			jugadorGanador = "EMPATE";
			jugadorPerdedor= "EMPATE";

		}
		
		return jugadorGanador;
	}

}
