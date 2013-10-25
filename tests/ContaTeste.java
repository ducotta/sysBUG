package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import banco.Conta;



public class ContaTeste {
	Conta umaConta;

	@Test
		public void test() {
			umaConta = new Conta(1234,11);
			umaConta.setTipo("Poupanca");
			umaConta.setSaldo(1000.00);
			
			assertEquals("Poupanca	Numero 1234	Saldo 1000.0",umaConta.toString());			
		}
	
}
