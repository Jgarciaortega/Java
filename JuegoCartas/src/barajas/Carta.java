package barajas;

public class Carta {

	//ATRIBUTOS

	private int numero; //Enteros del 1 al 10 donde 8=sota 9=caballo 10=rey
	private int palo; //0=oros 1=copas 2=espadas 3=bastos


	//CONSTRUCTORES
	public Carta(int numero, int palo) {

		this.numero = numero;
		this.palo = palo;

	}
	/*El ID construir� la carta a partir de un entero entre 1 y 40*/
	public Carta (int id) {

		/*Sabemos que dividiendo el ID podemos obtener numero y palo
		Hay dos opciones*/

		//OPCION 1
		/*El resto da 0. En nuestra lista no contamos el 0 de  numero, por
		 lo que sabemos que ese numero sera 10 (rey). El palo se obtiene
	     al dividir id / 10. Nos pasariamos en la lista de palo si cogieramos
	     el coeficiente obtenido, por lo que le restamos 1.	*/
		if (id % 10 == 0) {    
			this.palo = id / 10 -1;
			this.numero = 10;       		

			//OPCION 2
			/*En esta opcion no hay problema, los restos y coeficientes obtenidos cuadran
			 * con nuestra lista
			 */
		}else {		
			this.numero = id % 10;
			this.palo = id / 10 ;
		}

	}



	@Override
	public String toString() {
		return String.format("%s%n", getNombreCarta());
	}

	//PROPIEDADES



	public int getNumero (){

		return this.numero;
	}

	public int getPalo () {

		return this.palo;
	}


	public String getNombreNumero() {

		String numero;
		String [] valores = {" ","as","dos","tres","cuatro","cinco","seis","siete","sota","caballo","rey"};

		numero = valores[this.numero];

		return numero;

	}

	public String getNombrePalo() {

		String palo;
		String [] palos = {"oros","copas","espadas","bastos"};

		palo = palos[this.palo];

		return palo;
	}

	public String getNombreCarta() {

		String nombreCarta;

		nombreCarta = this.getNombreNumero() + " " + this.getNombrePalo(); 

		return nombreCarta;
	}

	public int getValorTute() {

		int valor;
		int [] valores = {0,11,0,10,0,0,0,0,2,3,4};

		valor = valores[this.numero];

		return valor;
	}

	public int getValorMuse() {

		int valor;
		int [] valores = {0,1,1,10,4,5,6,7,10,10,10};

		valor = valores[this.numero];

		return valor;
	}


	public double getValor7yMedio() {

		double valor;
		double [] valores = {0,1,2,3,4,5,6,7,0.5,0.5,0.5};

		valor = valores[this.numero];

		return valor;

	}

}

