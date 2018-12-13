
public class VierGewinnt {
	public static void main(String[] args) {
		
		SpielFeld2 spielFeld = new SpielFeld2();
		boolean farbe = false;
		boolean gewonnen = false;
		int spalte = 0;
		
		spielFeld.zeichne();
		
		while(!gewonnen){
			
			if(farbe == true){
				StdOut.println("Schwarz ist am Zug!");
			}
			else{
				StdOut.println("Rot ist am Zug!");
			}
			
			StdOut.println("In welche Spalte wollen Sie setzen?");
			spalte = StdIn.readInt();
			
				if(spalte<0 || spalte>6) {
					StdOut.println("Ungultige Spalte!");
					continue;
				}
			
			farbe = spielFeld.legeStein(spalte-1, farbe);
			spielFeld.zeichne();
			gewonnen = spielFeld.gewonnen();
		}
	}
}