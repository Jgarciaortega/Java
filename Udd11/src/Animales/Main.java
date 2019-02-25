package Animales;

public class Main {

	public static void main(String[] args) {
		
		adoptar(new Amardillo());
		Object o = new Amardillo();
		
		
		Animal a = new Amardillo();
		a.emitirSonido();
		a= new Muflon();
		a.emitirSonido();
		a = new Guepardo();
		a.emitirSonido();
	}

	
	private static void adoptar (Animal a) {
		
		System.out.println("Ven , cachorrito!");
	}
}
