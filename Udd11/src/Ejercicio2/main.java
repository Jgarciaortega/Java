package Ejercicio2;

public class main {

	public static void main(String[] args) {

		Libros elQuijote = new Libros("1A","El Quijote",1540);
		Revistas elJueves = new Revistas("2W", "El Jueves", 2018,323);

		System.out.println(elQuijote);
		System.out.println(elJueves);

		elQuijote.prestar();
		estado(elQuijote);
		elQuijote.devolver();
		estado(elQuijote);
	}

	public static void estado(Libros elQuijote) {

		if (elQuijote.prestado) {

			System.out.println("El libro esta prestado");

		}else {

			System.out.println("El libro no esta prestado");
		}

	}

}
