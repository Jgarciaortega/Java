package dominioXML;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.HashMap;
import java.util.Scanner;

public class Fichero {


	public HashMap <String, Integer> obtenerMunicipios (String digitoControl){

		String linea ="";
		HashMap<String, Integer> map = new HashMap();
		String[] partes;
		int codigo;
		boolean fin = false;
		try {
			FileReader entrada = new FileReader("src/dominioXML/fichero.csv");
			BufferedReader miBuffer = new BufferedReader(entrada);

			while(true) {

				linea = miBuffer.readLine();
				partes = separarDatos(linea);
				codigo = Integer.parseInt(partes[1]);

				if(linea.substring(0, 2).equals(digitoControl)) {

					map.put(partes[2],codigo);
					fin = true;

				}else {

					if(fin) {

						break;
					}
				}

			}

		} catch (IOException e) {

			System.out.println("Archivo no encontrado");
		}

		return map;	
	}

	
/**Obtiene archivo xml recibiendo el codigo del municipio **/
	
	public void descargarXML(int codigo) {
		try {
			
			String fichero = codigo + ".xml"; 
			URL url = new URL("http://www.aemet.es/xml/municipios/localidad_"+ fichero);
			Scanner s = new Scanner( url.openStream() );
			PrintWriter pw = new PrintWriter(new File(fichero));
			String linea;

			//Leer del scanner
			while(s.hasNext()) {

				//Leer línea del fichero de Internet
				linea = s.nextLine();
				//Escribir línea en el fichero Local
				pw.println( linea );
			}

			pw.close();
		}
		catch(IOException ex) {

			ex.printStackTrace();
		}
	}
	
	
	


	public String[] separarDatos(String linea) {

		String[] partes = linea.split(",");

		return partes;
	}

}