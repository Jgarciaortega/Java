package Ejercicio7_Eurocoin;

import java.util.ArrayList;

public class Moneda {

	//VARIABLES STATIC
	//Aqu� guardamos todos los valores que pueden llevar las monedas
	private static final String [] valores = {"1 centimo","2 centimos","5 centimos","10 centimos","25 centimos", 
			"50 centimos", "1 euro", "2 euros"};   
	
	//Aqu� se guardan las opciones cara y cruz
	private static final String [] lados = {"-cara","-cruz"};

	//VARIABLES DE INSTANCIA
	private String valor;
	private String lado;

	//CONSTRUCTOR
	//Este constructor recibir� dos enteros. Estos dos enteros ser�n las posiciones del vector que construir�n los
	//String de Moneda
	
	public Moneda(int posValor,int posLado) {

		this.valor = valores[posValor];
		this.lado = lados[posLado];

	}

	//METODO
	
	//public String getMoneda() {

	//	String moneda;

	//	moneda = this.valor + this.lado;

	//	return moneda;

	//}
	


	@Override
	public String toString() {
		
		String moneda;

		moneda = this.valor + this.lado;

		return moneda;
	}
		

}
