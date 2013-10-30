package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


import banco.Conta;
import banco.ControleBanco;
import banco.SysBUG;

public class ControleBancoTeste {
	ControleBanco umControle;
	SysBUG umBanco;
	

	@Before
	public void setUp() throws Exception {
		umBanco = new SysBUG();
		umControle = new ControleBanco();
		Conta poupanca = new Conta(123456, 013);
		Conta corrente = new Conta(654321, 012);
		umControle.adiciona(poupanca);
		umControle.adiciona(corrente);
	
	}

	@Test
	public void testGetListaDeContas() {
		assertNotNull(umControle.pegaConta(123456));
	}
	
	@Test
	public void testAdicionarConta() {
		assertNotNull(umBanco.getListaDeContas());
		
	}
	
	@Test
	public void testTotalDeContas(){
		assertEquals(2,umControle.pegaTotalDeContas());
		
	}

}
