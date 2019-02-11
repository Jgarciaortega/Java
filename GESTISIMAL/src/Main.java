import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int opc;
	    String nombre;
	    String codigo;
	    String descripcion;
		double precioCompra;
		double precioVenta;
		int stock;
		

		while(true) {

			System.out.println("***************************");
			System.out.println("        GESTISIMAL         ");
			System.out.println("***************************");
			System.out.println("Introduzca opcion para gestion de almancen");		
			System.out.printf("%n%s","1.- Listado\n");
			System.out.println("2.- Alta");
			System.out.println("3.- Baja");
			System.out.println("4.- Modificacion");
			System.out.println("5.- Entrada de mercancia");
			System.out.println("6.- Salida de mercancia");
			System.out.println("7.- Salir");

			opc = sc.nextInt();

			switch(opc) {

			case(1):

			{
				System.out.println("Introduce nombre articulo :");
				nombre = sc.nextLine();
				System.out.println("Introduce codigo articulo :");
				codigo = sc.nextLine();
				System.out.println("Introduce descripcion articulo");
				descripcion = sc.nextLine();
				System.out.println("Introduce precio de compra");
				precioCompra = sc.nextDouble();
				System.out.println("Introduce precio de venta");
				precioVenta = sc.nextDouble();
				System.out.println("Introduce la cantidad de stock");
				stock = sc.nextInt();
				
				
			}
			
			case(2):
			{
				
				
			}
			}





		}


	}

}
