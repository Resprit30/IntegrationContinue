package tn.esprit;

import org.junit.Assert;
import org.junit.Test;

public class CalculTest {
	Calcul calcul = new Calcul(); 
	 
	@Test
	public void testCalculerSom() {
		Assert.assertEquals(25, calcul.calculerSom(10, 15));
	} 

	@Test
	public void testCalculerDiff() {
		Assert.assertEquals(30, calcul.calculerDiff(40, 10));
	}

}
