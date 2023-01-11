package it.operazioni;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class OperazioniTest {
	
	@Test
	
	void createDivisione () {
	
	operazioni operazioni = new operazioni();
	
	IllegalArgumentException illegalArgumentException =
            assertThrows(IllegalArgumentException.class,
                    () -> operazioni.numeriDivisione(3,0));
	
	assertEquals("Impossibile dividere per zero",
            illegalArgumentException.getMessage());
}

	{
		
	
	}
}


