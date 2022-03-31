import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContribuinteTeste {

	@Test
	void testSetUf_para_aceitar_estado_sc() {
		//ARRANGE
		Contribuinte c = new Contribuinte("João", "123","SC", 3000);
		
		//ASSSERT
		assertEquals("SC", c.getUf());
	}
	
	@Test
	void testSetUf_para_aceitar_estado_pr() {
		//ARRANGE
		Contribuinte c = new Contribuinte("João", "123","PR", 3000);
		
		//ASSSERT
		assertEquals("PR", c.getUf());
	}
	
	@Test
	void testSetUf_para_aceitar_estado_RS() {
		//ARRANGE
		Contribuinte c = new Contribuinte("João", "123","RS", 3000);
		
		//ASSSERT
		assertEquals("RS", c.getUf());
	}
	
	@Test
	void testSetUf_para_aceitar_estado_SP() {
		//ARRANGE
		Contribuinte c = new Contribuinte("João", "123","SC", 3000);
		
		//ACT
		c.setUf("SP");
		
		//ASSSERT
		assertEquals("SC", c.getUf());
	}
	
	@Test
	void testSetUf_para_aceitar_estado_RJ() {
		//ARRANGE
		Contribuinte c = new Contribuinte("João", "123","SC", 3000);
		
		//ACT
		c.setUf("RJ");
		
		//ASSSERT
		assertEquals("SC", c.getUf());
	}

	@Test
	void testSetRendaAnual_teste_para_renda_negativa() {
		//ARRANGE
				Contribuinte c = new Contribuinte("João", "123","SC", 3000);
				
				//ACT
				c.setRendaAnual(-818.5);
				
				//ASSERT
				assertEquals(3000, c.getRendaAnual());
	} 	

	@Test
	void testCalcularImposto_para_uma_renda_de_3000() {
		//PADRÃO PARA TESTES
		//ARRANGE
		Contribuinte c = new Contribuinte("João", "123","SC", 3000);
		
		//ACT
		double imposto = c.calcularImposto();
		
		//ASSERT
		assertEquals(0.0, imposto);
	}
	
	@Test
	void testCalcularImposto_para_uma_renda_de_9000() {
		//PADRÃO PARA TESTES
		//ARRANGE
		Contribuinte c = new Contribuinte("João", "123","SC", 9000);
		
		//ACT
		double imposto = c.calcularImposto();
		
		//ASSERT
		assertEquals(522.0, imposto);
	}
	
	@Test
	void testCalcularImposto_para_uma_renda_de_10000() {
		//PADRÃO PARA TESTES
		//ARRANGE
		Contribuinte c = new Contribuinte("João", "123","SC", 10000);
		
		//ACT
		double imposto = c.calcularImposto();
		
		//ASSERT
		assertEquals(1500.0, imposto);
	}
	
	@Test
	void testCalcularImposto_para_uma_renda_de_30000() {
		//PADRÃO PARA TESTES
		//ARRANGE
		Contribuinte c = new Contribuinte("João", "123","SC", 34911.73);
		
		//ACT
		double imposto = c.calcularImposto();
		
		//ASSERT
		assertEquals(9600.72, imposto, 0.009);
	}

}
