package modelo;

/**
 * Excepcion para notificar que la dificultad seleccionada es invalida
 */

public class ExcepcionDificultad extends Exception{

	public ExcepcionDificultad() {
		super("Por favor ingrese un valor correcto");
	}

}
