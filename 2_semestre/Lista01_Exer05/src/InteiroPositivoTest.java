import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InteiroPositivoTest {
	

	@Test
	void testFatorial_do_valor_10() {
		InteiroPositivo c = new InteiroPositivo();
		c.setValor(10);
		assertEquals(3628800,c.fatorial());
	}
	
	@Test
	void testFatorial_do_valor_20() {
		InteiroPositivo c = new InteiroPositivo();
		c.setValor(20);
		assertEquals(2432902008176640000l,c.fatorial());
	}


	@Test
	void testDivisoresInteiros_do_valor_14() {
		InteiroPositivo c = new InteiroPositivo();
		c.setValor(14);
		assertEquals("1, 2, 7, 14, Quantidade de Divisores: 4", c.divisoresInteiros());
	}
	
	@Test
	void testDivisoresInteiros_do_valor_18() {
		InteiroPositivo c = new InteiroPositivo();
		c.setValor(18);
		assertEquals("1, 2, 3, 6, 9, 18, Quantidade de Divisores: 6", c.divisoresInteiros());
	}

	@Test
	void testFibonacci() {
		fail("Not yet implemented");
	}

}
