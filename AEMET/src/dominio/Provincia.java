package dominio;

import java.util.ArrayList;
import java.util.HashMap;

import dominioXML.Fichero;

public class Provincia {

	//Atributos
	private HashMap<String, Integer> municipios;

	//Constructor
	public Provincia() {

		municipios = new HashMap<String,Integer>();

	}

	//Getters and Setters
	
	

	//Funciones

	public void obtenerDatos(String nombre) {

		String linea = "";
		Fichero entrada = new Fichero();
		String digitoControl ="";
		
		switch(nombre) {
		
		case "alava" : digitoControl = "01"; break;
		case "albacete" : digitoControl = "02"; break;
		case "alicante" : digitoControl = "03"; break;
		case "alacant" : digitoControl = "03"; break;
		case "almeria" : digitoControl = "04"; break;
		case "asturias" : digitoControl = "33"; break;
		case "avila" : digitoControl = "05"; break;
		case "badajoz" : digitoControl = "06"; break;
		case "baleares, islas" : digitoControl = "07"; break;
		case "balears, illes" : digitoControl = "07"; break;
		case "barcelona" : digitoControl = "08"; break;
		case "burgos" : digitoControl = "09"; break;
		case "caceres" : digitoControl = "10"; break;
		case "cadiz" : digitoControl = "11"; break;
		case "cantabria" : digitoControl = "39"; break;
		case "castellon" : digitoControl = "12"; break;
		case "ceuta" : digitoControl = "51"; break;
		case "ciudad real" : digitoControl = "13"; break;
		case "cordoba" : digitoControl = "14"; break;
		case "coruña" : digitoControl = "15"; break;
		case "cuenca" : digitoControl = "16"; break;
		case "girona" : digitoControl = "17"; break;
		case "granada" : digitoControl = "18"; break;
		case "guadalajara" : digitoControl = "19"; break;
		case "guipuzcoa" : digitoControl = "20"; break;
		case "huelva" : digitoControl = "21"; break;
		case "jaen" : digitoControl = "22"; break;
		case "leon" : digitoControl = "23"; break;
		case "lugo" : digitoControl = "24"; break;
		case "lleida" : digitoControl = "25"; break;
		case "lerida" : digitoControl = "25"; break;
		case "madrid" : digitoControl = "28"; break;
		case "malaga" : digitoControl = "29"; break;
		case "melilla" : digitoControl = "52"; break;
		case "murcia" : digitoControl = "30"; break;
		case "navarra" : digitoControl = "31"; break;
		case "ourense" : digitoControl = "32"; break;
		case "palencia" : digitoControl = "34"; break;
		case "palmas, las" : digitoControl = "35"; break;
		case "pontevedra" : digitoControl = "36"; break;
		case "rioja, la" : digitoControl = "26"; break;
		case "salamanca" : digitoControl = "37"; break;
		case "santa cruz de tenerife" : digitoControl = "38"; break;
		case "segovia" : digitoControl = "40"; break;
		case "sevilla" : digitoControl = "41"; break;
		case "soria" : digitoControl = "42"; break;
		case "tarragona" : digitoControl = "43"; break;
		case "teruel" : digitoControl = "44"; break;
		case "toledo" : digitoControl = "45"; break;
		case "valencia" : digitoControl = "46"; break;
		case "valladolid" : digitoControl = "47"; break;
		case "vizcaya" : digitoControl = "48"; break;
		case "zamora" : digitoControl = "49"; break;
		case "zaragoza" : digitoControl = "50"; break;
		//default : buscarNombre(nombre); break; 
		//TODO Funcion que ante una posible equivocacion del usuario sujiera posible nombre
		}
		
		this.municipios = entrada.obtenerMunicipios(digitoControl);
		
	}

	@Override
	public String toString() {
		
		return "Municipios :" + municipios ;
		
	}
	
	/**Esta funcion devolvera el codigo del municipio solicitado desde el main**/
	
	public Integer obtenerCodigoMunicipio(String nombre) {
				
		return municipios.get(nombre);
				
	}
	
}
