
public class SpielFeld {

	public static void main(String[] args) {
		
		final int spielfeld = 160;
		final int anzahlZeilen = 8;	
		final int anzahlSpalten = 8;	
		final int kantenlange = (spielfeld/16);
		
		StdOut.println("Spielfeld: " + spielfeld + " Felder: " + anzahlZeilen + " Kantenlange: " + kantenlange);
		
		StdDraw.setXscale(0, spielfeld);
		StdDraw.setYscale(0, spielfeld);
		
		StdDraw.setPenColor(StdDraw.BLACK);
//		StdDraw.filledSquare(5, 5 ,5);
//		StdDraw.filledSquare(25, 5 ,5);
//		StdDraw.filledSquare(45, 5 ,5);
//		StdDraw.filledSquare(65, 5 ,5);

		int breite = spielfeld/anzahlSpalten;
		int hohe = spielfeld/anzahlZeilen;
		StdDraw.setPenColor(StdDraw.BLACK);
		
		for(int i=0; i<=anzahlZeilen; i++){		
			for(int j=0; j<=anzahlSpalten; j++){
				
				StdDraw.filledSquare(j*breite+breite/2, i*hohe+hohe/2, kantenlange);
				
					if(StdDraw.getPenColor() == StdDraw.BLACK){
						StdDraw.setPenColor(StdDraw.WHITE);
						StdOut.println("Farbe gewechselt!");
					}
					else{
						StdDraw.setPenColor(StdDraw.BLACK);
					}		
			}
		}
	}
}