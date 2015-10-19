package automat;

import static org.junit.Assert.*;

import org.junit.Test;

public class BilletautomatTest {
	Billetautomat automat = new Billetautomat();
	@Test
	public void testindtjening() {
				
		System.out.println("*** Tjek af, om maskinen regner rigtigt");
		automat.montørLogin("1234");
		automat.indsætPenge(40);
		automat.udskrivBillet();
		automat.setBilletpris(20);
		automat.udskrivBillet();
	assertEquals(30 , automat.getTotal());
	}
public void testgetbilletpris(){
	assertEquals(10,automat.getBilletpris());
}
	
}
