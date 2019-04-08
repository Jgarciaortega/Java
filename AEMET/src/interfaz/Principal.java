package interfaz;

import dominio.Municipio;
import dominio.Provincia;
import dominioXML.Fichero;

public class Principal {

	public static void main(String[] args) {

		Provincia prueba = new Provincia();
		Fichero datos = new Fichero();
		Municipio localidad;
		String linea = "";

		int codigo;

		prueba.obtenerDatos("valencia");
		
		codigo = prueba.obtenerCodigoMunicipio("Paiporta");
		
		localidad = new Municipio (codigo,"valencia");
		
		datos.descargarXML(codigo);
		
		System.out.println(codigo);
		
		
		
	}

}
