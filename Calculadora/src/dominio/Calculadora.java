package dominio;

import excepciones.DivisionPorCeroExcepcion;

public class Calculadora {

	//Atributos
	private double num1;
	private double num2;

	private String operacion;
	private String numActual;
	private String numMemoria;

	private boolean esInversa;

	//Constructor
	public Calculadora() {

		reset();
		this.setNumMemoria("0");
	}

	//Getters and Setters

	public boolean getEsInversa() {

		return this.esInversa;
	}

	public void ResetInversa() {

		this.esInversa = false;
	}

	public void setNum1(double num) {

		this.num1 = num;
	}

	public void setNum2(double num) {

		this.num2 = num;
	}

	public void setOperacion(String operacion) {

		this.operacion = operacion;
	}

	public void setNumActual(String dato) {

		this.numActual = dato;
	}

	public void setNumMemoria(String num) {

		this.numMemoria = num;
	}

	public double getNum1() {

		return this.num1;
	}

	public double getNum2() {

		return this.num2;
	}

	public String getOperacion() {

		return this.operacion;
	}
	public String getNumActual(){

		return this.numActual;
	}
	public String getNumMemoria() {

		return this.numMemoria;
	}

	//Operaciones aritmeticas
	public double suma() {

		return this.num1 + this.num2;
	}

	public double restar() {

		return this.num1 - this.num2;

	}

	public double multiplicar() {

		return this.num1 * this.num2;
	}

	public double dividir() throws DivisionPorCeroExcepcion{


		if(num2 == 0) {

			throw new DivisionPorCeroExcepcion();
		}

		return this.num1 / this.num2;

	}

	public void porcentaje() {

		if(this.operacion.equals("*%") || this.operacion.equals("/%")) {

			this.num2 = (this.num2 * 0.01);

		}else {

			this.num2 = (this.num2 * 0.01) * this.num1;	
		}


	}

	public double raiz() {

		return  Math.sqrt(this.num1);
	}


	public double inversa() throws DivisionPorCeroExcepcion{

		if(this.numActual.equals("")) {

			this.numActual = Double.toString(this.getNum1());

			if(this.num1 == 0) {

				throw new DivisionPorCeroExcepcion();
			}

		}

		this.operacion = "/";

		if(!this.esInversa) {

			this.num1 = 1;
			this.num2 = Double.parseDouble(numActual);
			this.esInversa = true;

		}else {

			this.num1 = this.num2;
			this.num2 = 1;
			this.esInversa = false;			
		}

		this.num1 = calcular();
		this.numActual = Double.toString(this.num1);
		return this.num1;

	}


	//Cambiar signo al valor actual

	public void cambiarSigno() {
		
		
		if(this.numActual.equals("")) {
			
			this.numActual = Double.toString(this.num1);
			
		}

		if(this.numActual.indexOf('-') == 0){

			this.numActual = this.numActual.substring(1);

		}else {

			this.numActual = "-" + numActual;
			
		}
	}

	//Resetear todas las variables

	public void reset() {

		this.setNum1(0);
		this.setNum2(0);
		this.setOperacion("");
		this.setNumActual("");		
		this.esInversa = false;
		//this.setNumMemoria("");

	}

	//Concatenar numero al numActual

	public String concatenar(String dato){

		if(numActual.equals("")) {

			if (dato.equals(".")) {

				this.numActual = 0 + dato;

			}else {

				this.numActual = dato;				
			}

		}else {

			if (dato.equals(".")) {
				//Si numActual no contiene coma la a�adimos a numActual
				if(this.numActual.indexOf('.') == -1) {

					this.numActual += dato;				
				}
			}else {
				//No permito concatenar otro 0 si numActual vale 0
				if(!this.numActual.equals("0")) {
					
						this.numActual += dato;

					//Si numActual vale 0 e introduzco un numero, ese numero sera numActual	
				}else {

					this.numActual = dato;
				}

			}
		}
		return this.numActual;
	}

	public void retroceder() {

		int nuevoTamanyo = this.numActual.length()-1;

		if(nuevoTamanyo >= 0) {

			this.numActual = this.numActual.substring(0,nuevoTamanyo);
		}
	}
	public void sumarMemoria() {

		double numMemoria;  
		double numActual;  

		if(this.numMemoria.equals("")) {

			this.numMemoria = "0";
		}

		if(this.numActual.equals("")) {

			this.numActual = "0";

		}

		numMemoria = Double.parseDouble(this.numMemoria);
		numActual = Double.parseDouble(this.numActual);

		this.numMemoria = "" + (numActual + numMemoria); 

	}

	public void restarMemoria() {

		double numMemoria;  
		double numActual;  

		if(this.numMemoria.equals("")) {

			this.numMemoria = "0";
		}

		if(this.numActual.equals("")) {

			this.numActual = Double.toString(this.num1);

		}

		numMemoria = Double.parseDouble(this.numMemoria);
		numActual = Double.parseDouble(this.numActual);

		this.numMemoria = "" + (numMemoria - numActual); 


	}

	//Calcular cualquier operacion

	public double calcular() throws DivisionPorCeroExcepcion{

		double res = 0;
		
		this.num2 = Double.parseDouble(this.numActual);
		this.numActual = "";

		switch(operacion) {

		case "+": res = suma(); break;
		case "-": res = restar(); break;
		case "*": res = multiplicar(); break;
		case "/": res = dividir(); break;
		case"+%": porcentaje(); res = suma(); break;
		case"-%": porcentaje(); res = restar(); break;
		case"*%": porcentaje(); res = multiplicar(); break;
		case"/%": porcentaje(); res = dividir(); break;

		}

		
		return res;
		
		
	}

}
