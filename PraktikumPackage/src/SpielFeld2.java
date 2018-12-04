
public class SpielFeld2 {

	public static void main(String[] args) {
		
		final int spielfeld = 80;
		final int anzahlZeilen = 6;	
		final int anzahlSpalten = 7;	
		
		StdDraw.setXscale(0, spielfeld);
		StdDraw.setYscale(0, spielfeld);

		int breite = spielfeld/anzahlSpalten;
		int hohe = spielfeld/anzahlZeilen;
		final int radius = Math.min(breite, hohe)/2-1;
		
		StdOut.println("Spielfeld: " + spielfeld + " Zeilen: " + anzahlZeilen + " Spalten: " + anzahlSpalten + " Radius: " + radius);
		
		for(int zeile=0; zeile<=anzahlZeilen; zeile++){		
			for(int spalte=0; spalte<=anzahlSpalten; spalte++){				
				StdDraw.circle(spalte*breite+breite/2, zeile*hohe+hohe/2, radius);
			}
		}
	}
}