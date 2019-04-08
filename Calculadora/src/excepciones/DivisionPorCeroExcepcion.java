package excepciones;

public class DivisionPorCeroExcepcion extends Exception{
	
	public String codigoError() {
		
		return "No es posible dividir por 0";
	}

}
