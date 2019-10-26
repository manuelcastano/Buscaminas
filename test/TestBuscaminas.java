import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.Buscaminas;
import modelo.ExcepcionDarPista;

/**
 * 
 * Clase realizada para testear los métodos de la clase buscaminas
 *
 */
public class TestBuscaminas {
	
	private Buscaminas juego;
	
	/**
	 * Metodo para inicializar la clase buscaminas en la dificultas principiante
	 */
	private void setupEscenario1() {
		juego = new Buscaminas(1);
	}
	
	/**
	 * Metodo para inicializar la clase buscaminas en la dificultas intermedio
	 */
	private void setupEscenario2() {
		juego = new Buscaminas(2);
	}
	
	/**
	 * Metodo para inicializar la clase buscaminas en la dificultas experto
	 */
	private void setupEscenario3() {
		juego = new Buscaminas(3);
	}
	
	/**
	 * Metodo para probar el metodo de mmostrar tablero
	 * Se prueba pasandole el tablero que se desea obtener y verificando el resultado sea igual al deseado
	 */
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
	
	/**
	 * Metodo para probar el metodo generar minas
	 * Se prueba contando la cantidad de minas en el tablero y asegurandose que sea igual a la cantidad de minas de acuerdo con la dificultad
	 */
	@Test
	public void testGenerarMinas() {
		setupEscenario1();
		juego.resolver();
		String azar1 = juego.mostrarTablero();
		int cantidadMinas = 0;
		for(int i = 0; i < azar1.length(); i++) {
			if(azar1.charAt(i) == '*') {
				cantidadMinas++;
			}
		}
		assertTrue(cantidadMinas == 10);
		setupEscenario2();
		juego.resolver();
		azar1 = juego.mostrarTablero();
		cantidadMinas = 0;
		for(int i = 0; i < azar1.length(); i++) {
			if(azar1.charAt(i) == '*') {
				cantidadMinas++;
			}
		}
		assertTrue(cantidadMinas == 40);
		setupEscenario3();
		juego.resolver();
		azar1 = juego.mostrarTablero();
		cantidadMinas = 0;
		for(int i = 0; i < azar1.length(); i++) {
			if(azar1.charAt(i) == '*') {
				cantidadMinas++;
			}
		}
		assertTrue(cantidadMinas == 99);	
	}
	
	/**
	 * Metodo para probar el metodo darPista
	 * Se prueba verificando que haya cambiado el tablero al llamarse el metodo darPista
	 */
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
	
	/**
	 * Metodo para probar el metodo gano
	 * Para probar el metodo primero se resuelve el tablero y luego se verifica que el metodo devuelva un True
	 * 
	 */
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
	
	/**
	 * Metodo para probar el metodo resolver
	 * Para probar el metodo se invoca y luego se verifica que en tablero no quede ningun caracter '-'
	 */
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
	
	/**
	 * Metodo para probar el metodo abrirCasilla
	 * Para probar el metodo primero se invoca sobre una casilla y luego se verifica el metodo darSeleccionada de la casilla devuelva un True
	 */
	@Test
	public void testAbrirCasilla() {
		setupEscenario1();
		for(int i = 0; i < juego.darCasillas().length; i++) {
			for(int j = 0; j < juego.darCasillas()[0].length; j++) {
				juego.abrirCasilla(i, j);
				assertTrue(juego.darCasillas()[i][j].darSeleccionada());
			}
		}
		setupEscenario2();
		for(int i = 0; i < juego.darCasillas().length; i++) {
			for(int j = 0; j < juego.darCasillas()[0].length; j++) {
				juego.abrirCasilla(i, j);
				assertTrue(juego.darCasillas()[i][j].darSeleccionada());
			}
		}
		setupEscenario3();
		for(int i = 0; i < juego.darCasillas().length; i++) {
			for(int j = 0; j < juego.darCasillas()[0].length; j++) {
				juego.abrirCasilla(i, j);
				assertTrue(juego.darCasillas()[i][j].darSeleccionada());
			}
		}
	}
	
	/**
	 * Metodo para probar el metodo cantidadMinasAlrededor
	 * Para probar el metodo se verifica en algunas casillas elegidas arbitrariamente y se verifica que la cantidad de minas a su alrededor no sea mayor al maximo posible
	 */
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
	
	/**
	 * Metodo para probar el metodo inicializarPartida
	 * Para probarlo se verifica que la cantidad de filas y columnas de la matriz sea igual al esperado de acuerdo con la dificultad
	 */
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
	
	/**
	 * Metodo para probar el metodo inicializarCasillasLibres
	 * Para probarlo se verifica que ninguna de las casillas de la matriz quede nula
	 */
	@Test
	public void testInicializarCasillasLibres() {
		setupEscenario1();
		for(int i = 0; i < juego.darCasillas().length; i++) {
			for(int j = 0; j < juego.darCasillas()[0].length; j++) {
				assertTrue(juego.darCasillas()[i][j] != null);
			}
		}
		setupEscenario2();
		for(int i = 0; i < juego.darCasillas().length; i++) {
			for(int j = 0; j < juego.darCasillas()[0].length; j++) {
				assertTrue(juego.darCasillas()[i][j] != null);
			}
		}
		setupEscenario3();
		for(int i = 0; i < juego.darCasillas().length; i++) {
			for(int j = 0; j < juego.darCasillas()[0].length; j++) {
				assertTrue(juego.darCasillas()[i][j] != null);
			}
		}
	}
}
