package Ejercicio6_Pizza;

public class Pizza {

	private static int totalServidas;
	private static int totalPedidas;
	private String tamanyo;
	private String tipo;
	private String estado;
	private boolean servida;



	public Pizza(String tipo, String tamanyo) {

		this.tamanyo = tamanyo;
		this.tipo = tipo;
		this.servida = false;
		this.estado = "pedida";
		totalPedidas++;

	}

	public void sirve() {

		if(servida) {

			System.out.println("esta pizza ya se ha servido");
			

		}else {
			
			this.estado ="servida";
			this.servida = true;
			totalServidas++;
		}

	}

	@Override
	public String toString() {

		return "pizza " + this.tipo +" "+ this.tamanyo +" "+ "," + this.estado;

	}

	public  static int getTotalPedidas(){

		return totalPedidas;

	}

	public static int getTotalServidas() {

		return totalServidas;
	}

}
