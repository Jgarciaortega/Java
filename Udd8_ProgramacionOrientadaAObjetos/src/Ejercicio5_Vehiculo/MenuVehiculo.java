package Ejercicio5_Vehiculo;

import java.util.Scanner;

public class MenuVehiculo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int opc;
		Bicicleta bicicleta = new Bicicleta();
		Coche coche = new Coche();
		

		while(true) {

			System.out.println("**MENU OPCIONES VEHICULO**");
			System.out.println("1. Anda con la bicicleta");
			System.out.println("2. Haz el caballito con la bicleta");
			System.out.println("3. Anda con el coche");
			System.out.println("4. Quema rueda con el coche");
			System.out.println("5. Ver kilometros de la bicicleta");
			System.out.println("6. Ver kilometros del coche");
			System.out.println("7. Ver kilometraje total");
			System.out.println("8. Ver vehiculos construidos");
			System.out.println("9. Salir");

			opc=sc.nextInt();
		
			switch(opc) {

			case(1):

			{
				bicicleta.andar(5);
				break;
			}

			case(2):

			{
				System.out.println(bicicleta.caballitoBicleta());
				break;
			}

			case(3):

			{
				coche.andar(5);
				break;
			}

			case(4):

			{
				System.out.println(coche.quemarRueda());
				break;
			}

			case(5):

			{
				System.out.println("Los km recorridos por la bici son: " + bicicleta.getKmRecorridos());
				System.out.println("");
				break;
			}

			case(6):

			{
				System.out.println("Los km recorridos por el coche son: " + coche.getKmRecorridos());
				System.out.println("");
				break;

			}

			case(7):

			{

				System.out.println("Los km totales por los vehiculos son :" + Vehiculo.getKilometrosTotales());
				System.out.println("");
				break;
			}
			
			case(8):
				
			{
				
				System.out.println("Los vehiculos totales construidos son :" + Vehiculo.getVehiculosCreados());
				break;
			}

			case(9):

			{

				System.exit(0);

			}
			}

		}

	}
}
