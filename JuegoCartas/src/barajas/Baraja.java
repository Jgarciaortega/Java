package barajas;

import java.util.ArrayList;

public class Baraja {

	//Atributos
	private ArrayList <Carta> baraja;


	//Constructor

	public Baraja (){

		this(1,false);
	}

	public Baraja(int tipoBaraja) {

		this(tipoBaraja,false);

	}

	public Baraja(int tipoBaraja, boolean barajar) {

		this.baraja = new ArrayList <Carta>();

		int veces = tipoBaraja;

		while (veces > 0) {

			for(int i = 1; i <= 40; i++) {

				Carta carta = new Carta (i);
				this.baraja.add(carta);

			}
			veces--;
		}

		if(barajar) {

			barajar();
		}

	}

	//Propiedades


	@Override
	public String toString() {
		return "" + baraja + "";

	}

	public int getNumeroCartas() {

		return baraja.size();

	}

	public boolean vacia() {

		return getNumeroCartas() <= 0 ;

	}

	//Metodos

	public Baraja getBaraja(){

		return this;

	}

	public void barajar() {


		Carta cartaSustituida;
		int aleatorio = 0;
		int numCartas = baraja.size();

		while(numCartas > 0) {

			aleatorio = (int) (Math.random() *numCartas);
			cartaSustituida = this.baraja.remove(aleatorio);
			this.baraja.add(cartaSustituida);
			numCartas --;

		}

	}

	public void cortar(int posicion) {

		Carta cartaSustituida;

		for (int i = 0; i < posicion; i++) {

			cartaSustituida = robar();
			insertaCartaFinal(cartaSustituida);

		}
	}

	public Carta robar() {

		Carta cartaRobada;
		cartaRobada = this.baraja.remove(0);

		return cartaRobada;
	}

	public void insertaCartaFinal(int id_carta) {

		Carta cartaAlFinal = new Carta (id_carta);
		this.baraja.add(cartaAlFinal);

	}

	public void insertaCartaPrincipio(int id_carta) {

		Carta cartaAlPrincipio = new Carta (id_carta);
		this.baraja.add(0, cartaAlPrincipio);		

	}

	public void insertaCartaFinal(Carta c) {

		this.baraja.add(c);	
	}

	public void insertaCartaPrincipio(Carta c) {

		this.baraja.add(0,c);

	}
}
