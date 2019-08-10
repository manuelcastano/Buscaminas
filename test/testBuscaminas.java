import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.Buscaminas;

class testBuscaminas {
	
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
		juego.darPista();
		String tablero2 = juego.mostrarTablero();
		assertFalse(tablero1.equals(tablero2));
		setupEscenario2();
		tablero1 = juego.mostrarTablero();
		juego.darPista();
		tablero2 = juego.mostrarTablero();
		assertFalse(tablero1.equals(tablero2));
		setupEscenario3();
		tablero1 = juego.mostrarTablero();
		juego.darPista();
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

}
