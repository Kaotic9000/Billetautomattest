package automat;

public class Tjekbilletkøb {
	public static void main(String[] args) 
	{
		
		
		Billetautomat automat = new Billetautomat();

		int antalFejl = 0;
		int retur;
		
		
		
		System.out.println("*** Tjek af, at man skal have indsat penge for at udskrive billet");
		automat.indsætPenge(0);
		automat.udskrivBillet();
		retur = automat.returpenge();
		automat.montørLogin("1234");
		if (automat.getAntalBilletterSolgt() == 1)
		{
			System.out.println("FEJL, der er kÃ¸bt en billet uden at indsÃ¦tte penge");
			antalFejl = antalFejl + 1;
		}
		
		
		
		
		
		
		System.out.println();
		System.out.println();
		System.out.println("Der blev fundet "+antalFejl+" fejl i automaten");
		if (antalFejl == 0) 
		{
			System.out.println("Automaten er fejlfri, HURRA!!!");
		} else 
		{
			System.out.println("Automaten har fejl, Ã˜V!!!");			
		}

	}

	private static Object tPenge(int i) {
		// TODO Auto-generated method stub
		return null;

	}
}
}
