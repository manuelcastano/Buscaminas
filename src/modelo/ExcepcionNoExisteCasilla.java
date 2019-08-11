package modelo;

/**
 * Excepcion para notificar que la casilla seleccionada es incorrecta
 */
public class ExcepcionNoExisteCasilla extends Exception{

	public ExcepcionNoExisteCasilla() {
		super("La casilla que seleccionaste no existe");
	}

}
