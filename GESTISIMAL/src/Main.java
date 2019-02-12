import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		Articulo articulo;
		int opc;
		String nombre;
		String codigo;
		String descripcion;
		double precioCompra;
		double precioVenta;
		int stock;
		int posicion;
		ArrayList <Articulo> almacen = new ArrayList();

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

				for(Articulo i: almacen) {

					System.out.println(i);
				}
				break;


			}

			case(2):
			{
				System.out.println("Introduce nombre articulo :");
				sc.nextLine();
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
				articulo = new Articulo (nombre,codigo,descripcion,precioCompra,precioVenta,stock);
				almacen.add(articulo);
			
			}
			break;
			case(3):
			{
				System.out.println("Introduzca el codigo del elemento a eliminar");
				codigo = sc.nextLine();
				posicion = buscaCodigo(codigo,almacen);				
				almacen.remove(posicion);

			}

			}

		}


	}

	public static int buscaCodigo(String codigo,ArrayList almacen) {

		int posicion=0;
		String datosArticulo;
		codigo = "codigo=" + codigo;

		for(int i = 0; i < almacen.size(); i++) {

			datosArticulo = (String) almacen.get(i);

			for (int z = 0; z < datosArticulo.length(); z++) {

				if (datosArticulo.contains(codigo)) {

					posicion = i;
					break;
				}

			}
		}

		return posicion;
	}

}
