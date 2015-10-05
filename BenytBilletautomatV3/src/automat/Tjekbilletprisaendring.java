package automat;

public class Tjekbilletprisaendring {
	public static void main(String[] args) 
	{
		

		Billetautomat automat = new Billetautomat();

		int antalFejl = 0;
		int retur;
		
		
		
		System.out.println("*** Tjek af, om man kan Ã¦ndre billetprisen uden at vÃ¦re logget ind som montÃ¸r");
		automat.setBilletpris(100);
		
		if (automat.getBilletpris() == 100)
		{
			System.out.println("FEJL, billetprisen er Ã¦ndret, trods man ikke er logget ind som montÃ¸r");
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
