package Ejercicio4_Fraccion;

import java.util.Scanner;

public class EjercicioFraccion {

	public static void main(String[] args) {

		int opc;
		double numerador,denominador;
		Scanner sc = new Scanner(System.in);


		

		while(true) {

			System.out.println("Introduce numerador");
			numerador = sc.nextDouble();
			System.out.println("Introduce denominador");
			denominador = sc.nextDouble();
			Fraccion frac = new Fraccion (numerador, denominador);
			
			
			System.out.println("---- M E N U ----");
			System.out.println(" 1-  Invertir");
			System.out.println(" 2-  Simplificar");
			System.out.println(" 3-  Sumar n�mero.");
			System.out.println(" 4-  Sumar fracci�n.");
			System.out.println(" 5-  Restar n�mero.");
			System.out.println(" 6-  Restar fracci�n.");
			System.out.println(" 7-  Dividir n�mero.");
			System.out.println(" 8-  Dividir fracci�n.");
			System.out.println(" 9-  Multiplicar n�mero.");
			System.out.println(" 10- Multiplicar fracci�n");
			System.out.print("Elige una opci�n: ");

			opc = sc.nextInt();

			switch(opc) {

			case(1):

			{

				System.out.println(frac.invertir());
				break;

			}

			case(2):

			{

				System.out.println(frac.simplifica());
				break;

			}

			case(3):

			{

				System.out.println("Introduce numero a sumar a la fraccion");
				numerador = sc.nextDouble();
				System.out.println(frac.suma(numerador));
				break;
			}

			case(4):

			{

				System.out.println("Introduce numerador");
				numerador = sc.nextDouble();
				System.out.println("Introduce denominador");
				denominador= sc.nextDouble();
				Fraccion frac2 = new Fraccion (numerador, denominador);

				System.out.println(frac.suma(frac2));
				break;

			}

			case(5):

			{

				System.out.println("Introduce un numero para restar a la fraccion");
				numerador = sc.nextDouble();
				System.out.println(frac.resta(numerador));
				break;

			}
			
			case(6):
				
			{
				
				System.out.println("Introduce numerador");
				numerador = sc.nextDouble();
				System.out.println("Introduce denominador");
				denominador= sc.nextDouble();
				Fraccion frac2 = new Fraccion (numerador * -1, denominador);

				System.out.println(frac.suma(frac2));
				break;
				
				
			}
			
			case(7):
				
			{
				
				System.out.println("Introduce numerador");
				numerador = sc.nextDouble();
				
				System.out.println(frac.divide(numerador));
				break;
				
			}
			
			
			case(8):
				
			{
				
				System.out.println("Introduce numerador");
				numerador = sc.nextDouble();
				System.out.println("Introduce denominador");
				denominador = sc.nextDouble();
				Fraccion frac2 = new Fraccion (numerador,denominador);
				
				System.out.println(frac.divide(frac2));
				break;
				
			}
			
			
			case(9):
				
			{
				
				Fraccion fracD = new Fraccion(); 
				System.out.println("Introduce numerador");
				numerador = sc.nextDouble();
				
				fracD = frac.multiplica(numerador);
				System.out.println(fracD);
				break;
				
			}

			
			case(10):
				
			{
				
				
				System.out.println("Introduce numerador");
				numerador = sc.nextDouble();
				System.out.println("Introduce denominador");
				denominador = sc.nextDouble();
				Fraccion fracD = new Fraccion(numerador,denominador);
				
				fracD = frac.multiplica(fracD);
				
				System.out.println(fracD);
				break;
				
			}
			
			
			case(11):

			{
				
				
				System.exit(0);

			}

			}



		}

	}

}
