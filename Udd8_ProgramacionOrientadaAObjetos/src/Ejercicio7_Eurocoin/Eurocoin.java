package Ejercicio7_Eurocoin;

import java.util.ArrayList;

public class Eurocoin {

	//VARIABLE DE INSTANCIA
	private ArrayList<Moneda> listaMonedas;


	//CONSTRUCTOR
	//Este objeto estar� compuesto de un  ArrayList , con los diferentes tipos de monedas creadas
	public Eurocoin() {

		this.listaMonedas = new ArrayList <Moneda>();

	}

	//M�TODO
	//Este metodo trabaja a partir del random que asigna a lado. Todo depende si este coincide o no. Si
	//no coincide el valor le asigno este a lado de la moneda y NO modifico la variable valor, que respeta 
	//su antiguo valor para seguir el patr�n correcto.
	
	public ArrayList<Moneda> generaListaMonedas(int cantidadMonedas) {

		int lado = 0;		
		int valor = (int) (Math.random()*8); //Lo inicializo random xq si lado NO coincide este sera la cantidad
		int aleatorio = 0;					//que asigne a la variable valor. De este manera no sera siempre un valor fijo
											//lo que le quitaria aleatoriedad al algoritmo
			
		for (int i = 0; i < cantidadMonedas; i++) {

			aleatorio = (int) (Math.random()*2); 

			if (lado != aleatorio) { //Si lado es diferente de aleatorio entra y asigna ese valor a lado y NO modifica valor
									 //respetando as� la regla, de que si no coincide lado ha de coincidir valor	
				lado = aleatorio;


			} else {	//Si lado = aleatorio 

				do {

					aleatorio = (int) (Math.random()*8);

				} while (valor ==aleatorio); //Mientras que valor no sea diferente de aletorio no parar�, ya que no estaria permitido

				valor = aleatorio;
			}

			Moneda eurocoin = new Moneda(valor,lado); //Hacemos una instancia de Moneda pasandole las dos variables enteras que requiere

			listaMonedas.add(eurocoin); // Se a�ade moneda a listaMonedas

		}

		return listaMonedas;
	}


}
