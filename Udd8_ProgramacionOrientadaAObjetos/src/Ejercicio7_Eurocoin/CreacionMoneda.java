package Ejercicio7_Eurocoin;

import java.util.ArrayList;

public class CreacionMoneda {

	public static void main(String[] args) {

		//Creo instancia de la clase Eurocoin
		Eurocoin eurocoin = new Eurocoin();
		
		//Ya que el objeto eurocoin es una lista, me creo una para almacenar su contenido
		ArrayList<Moneda> listaMonedas = new ArrayList<Moneda>(); 
		
		//Guardo en listaMoneda lo que devuelve generar lista monedas. El numero que le paso es
		//la cantidad de monedas que quiero que fabrique
		listaMonedas = eurocoin.generaListaMonedas(20);

		//Recorro la lista e imprimo su contenido
		for(Moneda i: listaMonedas) {

			System.out.println(i);			
		}

	}

}
