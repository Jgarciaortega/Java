package Ejercicio3_Cafetera;

public class Ejercicio3 {

	public static void main(String[] args) {

		Cafetera caf1 = new Cafetera();
		Cafetera caf2 = new Cafetera(2000);
		Cafetera caf3 = new Cafetera(1000,2000);


		System.out.println("VALORES INICIALES");
		System.out.println("La cantidad de la primera cafetera es :" + caf1.getCantidadActual());
		System.out.println("La cantidad de la segunda cafetera es :" + caf2.getCantidadActual());
		System.out.println("La cantidad de la tercera cafetera es :" + caf3.getCantidadActual());
		System.out.println("");
		
		System.out.println("APLICANDO MÉTODOS");
		caf1.llenarCafetera();
		System.out.println("La cantidad de la primera cafetera llena es : " + caf1.getCantidadActual());
		caf2.vaciarCafetera();
		System.out.println("La segunda cafetera esta a : " + caf2.getCantidadActual());
		caf3.servirTaza(100);
		System.out.println("La tercera cafetera despues de servir una taza es : " + caf3.getCantidadActual());
		
		caf2.agregarCafe(2200);
		System.out.println("La segunda cafetera esta llena porque hemos añadido mas de la capacidad maxima: " + caf2.getCantidadActual());
		
		caf3.servirTaza(2000);
		System.out.println("La tercera cafetera despues de utilizar 2000 esta a : " + caf3.getCantidadActual());
		caf3.llenarCafetera();
		System.out.println("Despues de llenar tercera cafetera hay : " + caf3.getCantidadActual());
		
	}

}
