package model;

/**
 * Excepcion para notificar que la dificultad seleccionada es invalida
 */

public class ExcepcionDificultad extends Exception{
	
	/**
	 * Constructor de la clase ExcepcionDarPista
	 */
	public ExcepcionDificultad() {
		super("Por favor ingrese un valor correcto");
	}

}
