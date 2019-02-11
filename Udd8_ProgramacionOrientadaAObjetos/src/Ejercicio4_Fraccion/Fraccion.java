package Ejercicio4_Fraccion;

public class Fraccion {

	private double numerador;
	private double denominador;


	//CONSTRUCTORES

	public Fraccion() {

		this(1);

	}

	public Fraccion (double numerador) {

		this(numerador,1);

	}

	public Fraccion (double numerador, double denominador) {

		this.numerador = numerador;
		this.denominador = denominador;

	}

	//GETTERS Y SETTERS

	public double getNumerador() {
		return numerador;
	}


	public double getDenominador() {
		return denominador;
	}




	//M�TODOS

	@Override
	public String toString() {
		return  numerador + "/" + denominador  ;
	}



	public Fraccion invertir() {

		Fraccion fracInvertida = new Fraccion(this.denominador, this.numerador);

		return fracInvertida;

	}

	public Fraccion simplifica () {

		double MCD = MCD(this.numerador, this.denominador);
		Fraccion fraccionSimplificada = new Fraccion(this.numerador, this.denominador);
		fraccionSimplificada.numerador = this.numerador/MCD;
		fraccionSimplificada.denominador = this.denominador/MCD;

		return fraccionSimplificada;

	}

	public Fraccion suma(double num) {

		Fraccion fracS = new Fraccion (num);
		return suma (fracS);


	}

	public Fraccion suma(Fraccion frac) {

		double mcm = 0;

		mcm = MCM(this.denominador,frac.denominador);	

		this.numerador= (mcm / this.denominador) * this.numerador;
		frac.numerador = (mcm / frac.denominador) * frac.numerador;

		frac.numerador = this.numerador + frac.numerador;
		frac.denominador = mcm;

		frac = frac.simplifica();

		return frac;

	}


	public Fraccion resta(double num) {

		Fraccion fracR = new Fraccion (num);
		return resta (fracR);


	}

	public Fraccion resta(Fraccion frac) {

		double mcm = 0;

		mcm = MCM(this.denominador,frac.denominador);
		frac = frac.multiplica(-1); //Para realizar la resta utilizamos la funcion multiplicar por -1 para convertirla en negativa

		frac = suma(frac); //Una vez la fraccion es negativa realizamos una suma, lo que equivaldr�a a realizar una resta
		return frac;
	}


	public Fraccion divide(double num) {

		Fraccion frac = new Fraccion(num);
		return divide(frac);

	}


	public Fraccion divide(Fraccion frac) {

		double temp;	
		temp = frac.numerador;

		frac.numerador = this.numerador * frac.denominador;
		frac.denominador = this.denominador * temp;

		frac.simplifica();

		return frac;
	}

	public Fraccion multiplica(double num) {

		Fraccion frac = new Fraccion(num);
		return multiplica(frac);

	}


	public Fraccion multiplica(Fraccion frac) {

		frac.numerador = this.numerador * frac.numerador;
		frac.denominador = this.denominador * frac.denominador;

		frac.simplifica();

		return frac;
	}

	//Maximo comun multiplo
	private double MCD(double a , double b) {

		return  (b == 0) ? a : MCD(b, a % b);

		/* if (b == 0){
		 * 
		 * 	return a;
		 * 
		 * else {
		 * 
		 * MCD(b,a % b);
		 */

	}

	//Minimo comun multiplo
	private double MCM(double num1, double num2) {

		double mcm = 0;
		double MCD = MCD(num1,num2);
		double a = Math.max(num1, num2);
		double b = Math.min(num1, num2);

		return mcm = (a/MCD) *b;

	}
	@Override 

	//Creamos este metodo para poder comprobar objetos
	public boolean equals (Object obj) {

		//Utilizamos el metodo equals de la clase Object
		
		Fraccion fraccion1 = (Fraccion) obj; //Le decimos que el obj sera un objeto de tipo Fraccion
		fraccion1.simplifica();

		Fraccion fraccion2 = new Fraccion(this.numerador,this.denominador);

		fraccion2 = this.simplifica();

		return (fraccion1.getNumerador() == fraccion2.getNumerador() && fraccion1.getDenominador() == fraccion2.getDenominador());

	}	

}


