package pci;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SumaServicioTest {

	private static SumaServicio ss = null;
	
	@BeforeAll
	public static void iniciar() {
		ss = new SumaServicio();
	}
	
	@Test
	@DisplayName(value = "sumar positivos")
	void testSumarPositivos() {
		assertEquals(ss.sumar(1, 1), 2);		
	}

	@Test
	@DisplayName(value = "sumar negativos")
	void testSumarNegativos() {
		assertEquals(ss.sumar(-1, -1), -2);		
	}

	
}
