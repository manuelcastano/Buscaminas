import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.Buscaminas;
import modelo.ExcepcionDarPista;

public class TestBuscaminas {
	
	private Buscaminas juego;
	
	private void setupEscenario1() {
		juego = new Buscaminas(1);
	}
	
	private void setupEscenario2() {
		juego = new Buscaminas(2);
	}
	
	private void setupEscenario3() {
		juego = new Buscaminas(3);
	}
	
	@Test
	public void testMostrarTablero() {
		setupEscenario1();
		String tablero = "     1  2  3  4  5  6  7  8\n" + 
				"1    -  -  -  -  -  -  -  -\n" + 
				"2    -  -  -  -  -  -  -  -\n" + 
				"3    -  -  -  -  -  -  -  -\n" + 
				"4    -  -  -  -  -  -  -  -\n" + 
				"5    -  -  -  -  -  -  -  -\n" + 
				"6    -  -  -  -  -  -  -  -\n" + 
				"7    -  -  -  -  -  -  -  -\n" + 
				"8    -  -  -  -  -  -  -  -\n";
		assertTrue(juego.mostrarTablero().equals(tablero));
		setupEscenario2();
		tablero = "     1  2  3  4  5  6  7  8  9  10 11 12 13 14 15 16\n" + 
				"1    -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -\n" + 
				"2    -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -\n" + 
				"3    -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -\n" + 
				"4    -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -\n" + 
				"5    -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -\n" + 
				"6    -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -\n" + 
				"7    -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -\n" + 
				"8    -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -\n" + 
				"9    -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -\n" + 
				"10   -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -\n" + 
				"11   -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -\n" + 
				"12   -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -\n" + 
				"13   -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -\n" + 
				"14   -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -\n" + 
				"15   -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -\n" + 
				"16   -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -\n";
		assertTrue(juego.mostrarTablero().equals(tablero));
		setupEscenario3();
		tablero = "     1  2  3  4  5  6  7  8  9  10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30\n" + 
				"1    -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -\n" + 
				"2    -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -\n" + 
				"3    -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -\n" + 
				"4    -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -\n" + 
				"5    -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -\n" + 
				"6    -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -\n" + 
				"7    -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -\n" + 
				"8    -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -\n" + 
				"9    -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -\n" + 
				"10   -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -\n" + 
				"11   -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -\n" + 
				"12   -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -\n" + 
				"13   -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -\n" + 
				"14   -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -\n" + 
				"15   -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -\n" + 
				"16   -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -\n";
		assertTrue(juego.mostrarTablero().equals(tablero));
	}
	
	@Test
	public void testGenerarMinas() {
		setupEscenario1();
		juego.resolver();
		String azar1 = juego.mostrarTablero();
		juego.resolver();
		setupEscenario1();
		juego.resolver();
		String azar2 = juego.mostrarTablero();
		assertTrue(!azar1.equals(azar2));
		int cantidadMinas = 0;
		for(int i = 0; i < azar1.length(); i++) {
			if(azar1.charAt(i) == '*') {
				cantidadMinas++;
			}
		}
		assertTrue(cantidadMinas == 10);
		cantidadMinas = 0;
		for(int i = 0; i < azar2.length(); i++) {
			if(azar2.charAt(i) == '*') {
				cantidadMinas++;
			}
		}
		assertTrue(cantidadMinas == 10);
		setupEscenario2();
		juego.resolver();
		azar1 = juego.mostrarTablero();
		juego.resolver();
		setupEscenario2();
		juego.resolver();
		azar2 = juego.mostrarTablero();
		assertTrue(!azar1.equals(azar2));
		cantidadMinas = 0;
		for(int i = 0; i < azar1.length(); i++) {
			if(azar1.charAt(i) == '*') {
				cantidadMinas++;
			}
		}
		assertTrue(cantidadMinas == 40);
		cantidadMinas = 0;
		for(int i = 0; i < azar2.length(); i++) {
			if(azar2.charAt(i) == '*') {
				cantidadMinas++;
			}
		}
		assertTrue(cantidadMinas == 40);
		setupEscenario3();
		juego.resolver();
		azar1 = juego.mostrarTablero();
		juego.resolver();
		setupEscenario3();
		juego.resolver();
		azar2 = juego.mostrarTablero();
		assertTrue(!azar1.equals(azar2));
		cantidadMinas = 0;
		for(int i = 0; i < azar1.length(); i++) {
			if(azar1.charAt(i) == '*') {
				cantidadMinas++;
			}
		}
		assertTrue(cantidadMinas == 99);
		cantidadMinas = 0;
		for(int i = 0; i < azar2.length(); i++) {
			if(azar2.charAt(i) == '*') {
				cantidadMinas++;
			}
		}
		assertTrue(cantidadMinas == 99);	
	}
	
	@Test
	public void testDarPista() {
		setupEscenario1();
		String tablero1 = juego.mostrarTablero();
		try {
			juego.darPista();
		}
		catch(ExcepcionDarPista e) {
		}
		String tablero2 = juego.mostrarTablero();
		assertFalse(tablero1.equals(tablero2));
		setupEscenario2();
		tablero1 = juego.mostrarTablero();
		try {
			juego.darPista();
		}
		catch(ExcepcionDarPista e) {
		}
		tablero2 = juego.mostrarTablero();
		assertFalse(tablero1.equals(tablero2));
		setupEscenario3();
		tablero1 = juego.mostrarTablero();
		try {
			juego.darPista();
		}
		catch(ExcepcionDarPista e) {
		}
		tablero2 = juego.mostrarTablero();
		assertFalse(tablero1.equals(tablero2));
	}
	
	@Test
	public void testGano() {
		setupEscenario1();
		assertFalse(juego.gano());
		juego.resolver();
		assertTrue(juego.gano());
		setupEscenario2();
		assertFalse(juego.gano());
		juego.resolver();
		assertTrue(juego.gano());
		setupEscenario3();
		assertFalse(juego.gano());
		juego.resolver();
		assertTrue(juego.gano());
	}
	
	@Test
	public void testResolver() {
		setupEscenario1();
		juego.resolver();
		String tablero = juego.mostrarTablero();
		boolean mina = false;
		for(int i = 0; i < tablero.length() && !mina; i++) {
			if(tablero.charAt(i) == '-') {
				mina = true;
			}
		}
		assertFalse(mina);
		setupEscenario2();
		juego.resolver();
		tablero = juego.mostrarTablero();
		mina = false;
		for(int i = 0; i < tablero.length() && !mina; i++) {
			if(tablero.charAt(i) == '-') {
				mina = true;
			}
		}
		assertFalse(mina);
		setupEscenario3();
		juego.resolver();
		tablero = juego.mostrarTablero();
		mina = false;
		for(int i = 0; i < tablero.length() && !mina; i++) {
			if(tablero.charAt(i) == '-') {
				mina = true;
			}
		}
		assertFalse(mina);
	}
	
	@Test
	public void testAbrirCasilla() {
		setupEscenario1();
		for(int i = 0; i < juego.darCasillas().length; i++) {
			for(int j = 0; j < juego.darCasillas()[0].length; j++) {
				juego.abrirCasilla(i, j);
				assertTrue(juego.darCasillas()[i][j].darSeleccionada());
			}
		}
	}
	
	@Test
	public void testCantidadMinasAlrededor() {
		setupEscenario1();
		assertFalse(juego.darCasillas()[0][0].darValor() > 3);
		assertFalse(juego.darCasillas()[7][7].darValor() > 3);
		assertFalse(juego.darCasillas()[4][7].darValor() > 8);
		setupEscenario2();
		assertFalse(juego.darCasillas()[0][0].darValor() > 3);
		assertFalse(juego.darCasillas()[2][1].darValor() > 5);
		assertFalse(juego.darCasillas()[4][7].darValor() > 8);
		setupEscenario3();
		assertFalse(juego.darCasillas()[0][0].darValor() > 3);
		assertFalse(juego.darCasillas()[1][4].darValor() > 5);
		assertFalse(juego.darCasillas()[4][7].darValor() > 8);
	}
	
	@Test
	public void testInicializarPartida() {
		setupEscenario1();
		assertTrue(juego.darCasillas().length == 8);
		assertTrue(juego.darCasillas()[0].length == 8);
		setupEscenario2();
		assertTrue(juego.darCasillas().length == 16);
		assertTrue(juego.darCasillas()[0].length == 16);
		setupEscenario3();
		assertTrue(juego.darCasillas().length == 16);
		assertTrue(juego.darCasillas()[0].length == 30);
	}
	
	@Test
	public void testInicializarCasillasLibres() {
		setupEscenario1();
		for(int i = 0; i < juego.darCasillas().length; i++) {
			for(int j = 0; j < juego.darCasillas()[0].length; j++) {
				assertTrue(juego.darCasillas()[i][j] != null);
			}
		}
	}
}
