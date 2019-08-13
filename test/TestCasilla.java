import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.Casilla;

/**
 * 
 * Clase hecha para probar la clase casilla
 *
 */
public class TestCasilla {
	
	private Casilla casilla;
	
	/**
	 * Escenario donde la casilla es una mina
	 */
	private void setupEscenario1() {
		casilla = new Casilla(Casilla.MINA);
	}
	
	/**
	 * Escenario donde la casilla es una casilla libre
	 */
	private void setupEscenario2() {
		casilla = new Casilla(Casilla.LIBRE);
	}
	
	/**
	 * Escenario donde la casilla se ha destapado
	 */
	private void setupEscenario3() {
		casilla.destapar();
	}
	
	/**
	 * Metodo para probar el metodo mostrarValorCasilla
	 * Para probarlo se verifica que el metodo arroje el resultado esperado de acuerdo con el escenario creado
	 */
	@Test
	public void testMostrarValorCasilla() {
		setupEscenario1();
		assertTrue(casilla.mostrarValorCasilla().equals("-"));
		setupEscenario3();
		assertTrue(casilla.mostrarValorCasilla().equals("*"));
		setupEscenario2();
		assertTrue(casilla.mostrarValorCasilla().equals("-"));
		setupEscenario3();
		assertFalse(casilla.mostrarValorCasilla().equals("-"));
		assertTrue(casilla.mostrarValorCasilla().equals(casilla.darValor()+""));
	}

}
