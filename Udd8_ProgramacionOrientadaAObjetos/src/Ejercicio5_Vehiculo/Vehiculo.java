package Ejercicio5_Vehiculo;

public abstract class  Vehiculo {

	private static int vehiculosCreados;
	private static int kilometrosTotales;
	protected int kilometrosRecorridos;


	public Vehiculo() {

		this.kilometrosRecorridos = 0;
		kilometrosTotales = 0;
		vehiculosCreados++;

	}

	public void andar(int cantidadKm) {

		this.kilometrosRecorridos += cantidadKm;
		kilometrosTotales += cantidadKm;

	}

	public int getKmRecorridos() {

		return kilometrosRecorridos;

	}

	public static int getKilometrosTotales() {

		return kilometrosTotales;

	}

	public static int getVehiculosCreados() {

		return vehiculosCreados;

	}
}
