
public class SpielFeld2 {

	final double spielfeld = 80;
	final double anzahlZeilen = 6;
	final double anzahlSpalten = 7;
	
	final double breite = spielfeld / anzahlSpalten;
	final double hohe = spielfeld / anzahlZeilen;
	final double radius = Math.min(breite, hohe) / 2 - 1;


	SpielStein felder[][] = new SpielStein[(int) anzahlSpalten][(int) anzahlZeilen];

	public void zeichne() {
		StdDraw.setXscale(0, spielfeld);
		StdDraw.setYscale(0, spielfeld);
		StdDraw.rectangle(spielfeld / 2, spielfeld / 2, spielfeld / 2, spielfeld / 2);

		StdOut.println("Spielfeld: " + spielfeld + " Zeilen: " + anzahlZeilen + " Spalten: " + anzahlSpalten
				+ " Radius: " + radius);

		for (int zeile = 0; zeile < anzahlZeilen; zeile++) {
			for (int spalte = 0; spalte < anzahlSpalten; spalte++) {
				StdDraw.setPenColor(StdDraw.BLACK);
				StdDraw.circle(spalte * breite + breite / 2, zeile * hohe + hohe / 2, radius);

				if (felder[spalte][zeile] != null) {
					felder[spalte][zeile].zeichne(spalte * breite + breite / 2, zeile * hohe + hohe / 2, radius);
				}
			}
		}
	}
	
	public boolean legeStein(int spalte, boolean farbe){
		
		for(int zeile=0; zeile < anzahlZeilen; zeile++){
			if(felder[spalte][zeile] == null){
				SpielStein stein = new SpielStein(farbe);
				felder[spalte][zeile] = stein;
				stein.zeichne(spalte * breite + breite / 2, zeile * hohe + hohe / 2, radius);
				farbe = !farbe;
				break;
				
			}
		}		
		return farbe;		
	}
	
	public boolean gewonnen() {
		boolean gewonnen = false;
		for(int zeile=0; zeile < 2; zeile++) {
			for(int spalte=0; spalte < 3; spalte++) {
				if(felder[spalte][zeile] != null && felder[spalte+1][zeile] != null && felder[spalte+2][zeile] != null && felder[spalte+3][zeile] != null) {			
					
					
					if(felder[spalte][zeile].istSchwarz && felder[spalte+1][zeile].istSchwarz && felder[spalte+2][zeile].istSchwarz && felder[spalte+3][zeile].istSchwarz){
						StdOut.println("Das Spiel ist vorbei!");
						gewonnen = true;
						break;
					}
					else if(!felder[spalte][zeile].istSchwarz && !felder[spalte+1][zeile].istSchwarz && !felder[spalte+2][zeile].istSchwarz && !felder[spalte+3][zeile].istSchwarz){
						StdOut.println("Das Spiel ist vorbei!");
						gewonnen = true;
						break;
					}
				}
				
				if(felder[spalte][zeile] != null && felder[spalte][zeile+1] != null && felder[spalte][zeile+2] != null && felder[spalte][zeile+3] != null) {
					
					if(!felder[spalte][zeile].istSchwarz && !felder[spalte][zeile+1].istSchwarz && !felder[spalte][zeile+2].istSchwarz && !felder[spalte][zeile+3].istSchwarz){
						StdOut.println("Das Spiel ist vorbei!");
						gewonnen = true;
						break;
		
				}
					else if(felder[spalte][zeile].istSchwarz && felder[spalte][zeile+1].istSchwarz && felder[spalte][zeile+2].istSchwarz && felder[spalte][zeile+3].istSchwarz) {
						StdOut.println("Das Spiel ist vorbei!");
						gewonnen = true;
						break;
					}
				}
			}
		
		}
		return gewonnen;
	}
}