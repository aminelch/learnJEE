package metier;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestSomme {
	private ISommeMetier metier;

	@Before
	public void setUp() throws Exception {
		metier = new SommeMetierImpl();
	}

	@Test
	public void testCalculerSomme() {
		double v1 = 3;
		double v2 = 6;
		double resultatCalcule = metier.calculerSomme(v1, v2);
		double resultatAttendu = 9;
		assertEquals(resultatAttendu, resultatCalcule, 0);
	}

}
