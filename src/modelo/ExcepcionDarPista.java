package modelo;

/**
 * Excepcion para notificar que no se pueden dar mas pistas al usuario
 */
public class ExcepcionDarPista extends Exception{
	
	/**
	 * Constructor de la clase ExcepcionDarPista
	 */
	public ExcepcionDarPista() {
		super("No hay mas pistas para dar");
	}

}
