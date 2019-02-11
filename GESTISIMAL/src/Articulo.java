
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
	
	public Articulo(String nombre, String codigo, String descripcion, double precioCompra, double precioVenta,int stock) {

		this.nombre = nombre;
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
		this.stock = stock;
	}

	//PROPIEDADES

	public void altaArticulo() {


	}

	@Override
	public String toString() {
		return "Articulo [nombre=" + nombre + ", codigo=" + codigo + ", descripcion=" + descripcion + ", precioCompra="
				+ precioCompra + ", precioVenta=" + precioVenta + ", stock=" + stock + "]";
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
