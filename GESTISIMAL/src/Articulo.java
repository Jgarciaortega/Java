
public class Articulo {

	//ATRIBUTOS
	private String nombre;
	private String codigo;
	private String descripcion;
	private double precioCompra;
	private double precioVenta;
	private int stock;

	//CONSTRUCTOR
	public Articulo() {


		

	}

	//PROPIEDADES
	
	public void altaArticulo() {
		
		
	}

	public void bajaArticulo() {
		

	}

	public void modificacion(int opcion) {

		switch(opcion) {
		//Nombre
		case(1):
		{
			
		}
		//Codigo
		case(2):
		{

		}
		//Descripcion
		case(3):
		{

		}
		//PrecioCompra
		case(4):
		{

		}
		//PrecioVenta
		case(5):
		{

		}

		}

	}

	public void entradaMercancia(int cantidad) {

		this.stock += cantidad;

	}

	public void salidaMercancia(int cantidad) {

		this.stock -= cantidad;

	}

}
