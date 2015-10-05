package automat;

public class Tjekafindtjening {
	public static void main(String[] args) 
	{

		Billetautomat automat = new Billetautomat();

		int antalFejl = 0;
		int retur;
		
		
		
		System.out.println("*** Tjek af, om maskinen regner rigtigt");
		automat.montørLogin("1234");
		automat.indsætPenge(40);
		automat.udskrivBillet();
		automat.setBilletpris(20);
		automat.udskrivBillet();
		
//		Jeg har fÃ¸rst kÃ¸bt en billet til 10 kroner, Ã¦ndrer da billetprisen til 20kr, og udskriver igen en billet.
//		Maskinen mener nu at den har tjent 40kr, fordi den siger AntalBilletterSolgt*Billetpris.
//		Den ignorerer altsÃ¥ at billetprisen kan have vÃ¦ret anderledes fÃ¸r, og tror den har tjent 40, i stedet for 30.
//		Jeg kunne ikke fÃ¥ den til at printe dette ud som en fejl.

		{
			System.out.println("FEJL, maskinen tror den har tjent 40kr, pÃ¥ trods af at den kun har tjent 30");
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



}
