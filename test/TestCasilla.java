import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.Casilla;

public class TestCasilla {
	
	private Casilla casilla;

	private void setupEscenario1() {
		casilla = new Casilla(Casilla.MINA);
	}
	
	private void setupEscenario2() {
		casilla = new Casilla(Casilla.LIBRE);
	}
	
	private void setupEscenario3() {
		casilla.destapar();
	}
	
	@Test
	public void testMostrarValorCasilla() {
		setupEscenario1();
		assertTrue(casilla.mostrarValorCasilla().equals("-"));
		setupEscenario3();
		assertTrue(casilla.mostrarValorCasilla().equals("*"));
		setupEscenario2();
		assertTrue(casilla.mostrarValorCasilla().equals("-"));
		setupEscenario3();
		assertTrue(casilla.mostrarValorCasilla().equals(casilla.darValor()+""));
	}

}
