package Ejercicio3;

import java.util.Arrays;

public class ArrayReales implements Estadisticas {

	private double[] vectorReal;
	
	
	public ArrayReales() {
		
		
	this.vectorReal = new double[11];
	
	}
	
	
	
	public void setValores(int numeros) {
		
		for (int i = 0; i < numeros; i++) {
			
			this.vectorReal[i]= i;
		}
		
	}
	
	
	
	
	@Override
	public String toString() {
		
		return "" + Arrays.toString(vectorReal) + "";
	}



	@Override
	public double minimo() {
		
		
		
		return 0;
	}

	@Override
	public double maximo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double sumatorio() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
