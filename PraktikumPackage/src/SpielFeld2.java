
public class SpielFeld2 {

	final double spielfeld = 80;
	final double anzahlZeilen = 6;
	final double anzahlSpalten = 7;

	SpielStein felder[][] = new SpielStein[(int) anzahlSpalten][(int) anzahlZeilen];

	public void zeichne() {
		StdDraw.setXscale(0, spielfeld);
		StdDraw.setYscale(0, spielfeld);
		StdDraw.rectangle(spielfeld / 2, spielfeld / 2, spielfeld / 2, spielfeld / 2);

		final double breite = spielfeld / anzahlSpalten;
		final double hohe = spielfeld / anzahlZeilen;
		final double radius = Math.min(breite, hohe) / 2 - 1;

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
		
		for(int zeile=0; zeile< anzahlZeilen; zeile++){
			if(felder[zeile] == null){
				SpielStein stein = new SpielStein(farbe);
				stein.zeichne(spalte * breite + breite , yPos, groesse);
				
			}
		}
		
		
		return true;
		
	}
}