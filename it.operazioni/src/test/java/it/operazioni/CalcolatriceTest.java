package it.operazioni;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

import it.operazioni.operazioni;

public class CalcolatriceTest {
	
	static int a=5;
	static int b =8;
	
	operazioni  Operazioni = new operazioni();
	
	@Test
	
	void sommaTest() {
		assertEquals(13,Operazioni.numeriSomma(a, b));
	}
		
	
	@Test 
	
	void sottraTest() {
		
		assertEquals(-3, Operazioni.numeriSottrazione(a, b));
		
	}
	
	@Test 
	
	void MoltiplicaTest() {
		assertEquals(40, Operazioni.numeriMoltiplicazione(a, b));
		
		
	}
	
	@Test 
	
	void DivisioneTest() {
		assertEquals (0,6, Operazioni.numeriDivisione(a, b) );
	}
	
	@Test 
	
	void PotenzaTest() {
		assertEquals(390625, Operazioni.numeriPotenza(a, b));
	}
	
	@Test 
	
	void MediaTest() {
		
		assertEquals (6,5, Operazioni.numeriMedia(a, b));
	}
	
	

}
