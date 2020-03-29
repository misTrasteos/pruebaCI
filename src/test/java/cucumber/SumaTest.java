package cucumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pci.SumaServicio;

public class SumaTest {

	SumaServicio ss = new SumaServicio();
	
	Integer primerParametro 	= null;
	Integer segundoParametro	= null;
	
	
	@Given("^la entrada es (\\d+) más (\\d+)$")
	public void given(int a, int b) throws Throwable {
		this.primerParametro 	= a;
		this.segundoParametro 	= b;
	}// given

	@When("^realizo la suma$")
	public void when() throws Throwable {
		
		//throw new PendingException();
		
	}// when

	
	@Then("el resultado debe ser (\\d+)$")
	public void el_resultado_debe_ser_resultadoEsperado(int resultadoEsperado) {
		int resultadoObtenido = this.ss.sumar(this.primerParametro, this.segundoParametro);
		
		assertEquals(resultadoObtenido, resultadoEsperado);	

		//assertEquals(resultadoObtenido, 0);	

		
	}	
	
}// class
