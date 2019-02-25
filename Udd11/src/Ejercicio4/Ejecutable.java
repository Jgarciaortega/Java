package Ejercicio4;

public class Ejecutable {

	public static void main(String[] args) {

		Serie[] series = new Serie[5];
		Videojuego[] videojuegos = new Videojuego[5];
		int entregados;
		Serie serieConMasTemporadas;
		Videojuego videoJuegoConMasHoras;

		Serie lost = new Serie("Lost",6,"drama","Damon Lindelof");
		Serie breakingBad = new Serie("Breaking Bad",5,"drama","Vince Giligan");
		Serie otraSerie = new Serie();
		Serie otraSerie2 = new Serie("Serie","nombre creador");
		Serie strangerThings = new Serie("Stranger Things",2,"drama","Matt Duffer");

		Videojuego videojuego1 = new Videojuego();
		Videojuego videojuego2 = new Videojuego("Videojuego 1",10);
		Videojuego videojuego3 = new Videojuego("Videojuego 2",22,"Accion","Companyia1");
		Videojuego videojuego4 = new Videojuego("Videojuego 3", 11);
		Videojuego videojuego5 = new Videojuego("Videojuego 4", 48,"Accion","Comanyia2");

		series[0]= lost;
		series[1]= breakingBad;
		series[2]= otraSerie;
		series[3]= otraSerie2;
		series[4]= strangerThings;

		videojuegos[0]= videojuego1;
		videojuegos[1]= videojuego2;
		videojuegos[2]= videojuego3;
		videojuegos[3]= videojuego4;
		videojuegos[4]= videojuego5;


		videojuego3.entregar();
		lost.entregar();
		strangerThings.entregar();
		videojuego5.entregar();

		System.out.println("Las series entregadas son :");
		entregados = devolverTotalSeriesEntregadas(series);
		System.out.println("En total son: " + entregados + " series entregadas");
		System.out.println("Los videojuegos entregados son :");
		entregados = devolverTotalVideojuegosEntregados(videojuegos);
		System.out.println("En total son: " + entregados + "videojuegos entregados");
		serieConMasTemporadas = devolverSerieConMasTemporadas(series);
		System.out.printf("La serie con mas temporadas es: ");
		imprimir(serieConMasTemporadas);
		System.out.printf("El videojuego con mas horas es: ");
		videoJuegoConMasHoras = devolverVideojuegoConMasHoras(videojuegos);
		imprimir(devolverVideojuegoConMasHoras(videojuegos));

	}

	public static int devolverTotalSeriesEntregadas(Serie[] series) {

		int cont = 0;

		for(int i = 0; i < series.length; i++) {

			if (series[i].isEntregado()) {

				cont ++;
				imprimir(series[i]);

			}

		}

		return cont;
	}

	public static int devolverTotalVideojuegosEntregados(Videojuego[] videojuegos) {

		int cont = 0;

		for(int i = 0; i < videojuegos.length; i++) {

			if (videojuegos[i].isEntregado()) {

				cont ++;
				imprimir(videojuegos[i]);

			}

		}


		return cont;

	}

	public static void imprimir (Serie serie) {

		System.out.println("Titulo: " + serie.getTitulo() + " Autor: " + serie.getCreador());

	}

	public static void imprimir (Videojuego videojuego) {

		System.out.println("Titulo: " + videojuego.getTitulo() + " Autor: " + videojuego.getCompanyia());
	}

	public static Serie devolverSerieConMasTemporadas(Serie[] series) {

		Serie serie = series[0];

		for (int i = 0; i < series.length; i++) {

			if (serie.compareTo(series[i])) { 

				serie= series[i];
			}

		}

		return serie;
	}

	public static Videojuego devolverVideojuegoConMasHoras(Videojuego[] videojuegos) {

		Videojuego videojuego= new Videojuego();

		for (int i = 0; i < videojuegos.length; i++) {

			if (videojuego.compareTo(videojuegos[i])) { 

				videojuego= videojuegos[i];
			}

			
		}
		
		return videojuego;
	}
}

