package principal;

import java.util.ArrayList;
import java.util.Scanner;

import barajas.Baraja;
import barajas.Carta;
import juegos.Siete_Y_Medio;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int opc = 1;
		String player1;
		
		String player2;

		while(opc == 1) {

			System.out.println("***********************************************");
			System.out.println("     JUEGOS DE CARTAS DAW DAW ");
			System.out.println("***********************************************");
			System.out.println("1.- 7 y medio");
			System.out.println("2.- La brisca");
			System.out.println("3.- Tute");
			System.out.println("8.- Cambiar idioma");
			System.out.println("9.- Salir");
			System.out.println("Opcion:");
			opc=sc.nextInt();

			switch(opc) {

			case(1):

			{				
				selectPlayers();								
				break;
			}

			case(2):

			{


			}

			case(3):

			{

			}

			case(8):

			{


			}

			case(9):

			{

				System.exit(0);
			}

			default:

			{

				System.out.println("Opcion no valida");
				break;
			}
			}

			
		}


	}


	public static void selectPlayers() {
		
		Siete_Y_Medio sieteYmedio = new Siete_Y_Medio("7yMedio", "espa�ol",1);
		String player1 = null;
		String player2 = null;
		int opc;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("SELECCIONE JUGADORES :");
		System.out.println("1.- Dos jugadores");
		System.out.println("2.- CPU contra jugador");
		System.out.println("3.- Salir");

		opc = sc.nextInt();
		
		switch(opc) { 

		case(1):
		{
			System.out.println("Introduce nombre del jugador 1 :");
			sc.nextLine();
			player1 = sc.nextLine();
			System.out.println("Introduce nombre del jugador 2 :");
			player2 = sc.nextLine();
			break;
		}

		case(2):
		{
			System.out.println("Introduce nombre del jugador que se enfrentar� contra CPU");
			sc.nextLine();
			player1 = sc.nextLine();
			player2 = "CPU";
			break;
		}

		case(3):
		{

			main(null);
		}

		default:
		{
			System.out.println("Opcion no valida");
			break;

		}
		
		
		}

		sieteYmedio.setNomJugador(player1, player2);
		sieteYmedio.jugar();
	}

}

