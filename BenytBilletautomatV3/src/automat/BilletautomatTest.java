package automat;

import static org.junit.Assert.*;

import org.junit.Test;

public class BilletautomatTest {

	@Test
	public void testindtjening() {
		
		Billetautomat automat = new Billetautomat();
		
		
		
		System.out.println("*** Tjek af, om maskinen regner rigtigt");
		automat.montørLogin("1234");
		automat.indsætPenge(40);
		automat.udskrivBillet();
		automat.setBilletpris(20);
		automat.udskrivBillet();
	assertEquals(30 , automat.getTotal());
	}

	
}
