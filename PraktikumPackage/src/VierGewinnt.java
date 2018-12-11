
public class VierGewinnt {
	public static void main(String[] args) {
		
		SpielFeld2 spielFeld = new SpielFeld2();
		boolean farbe = false;
		boolean gewonnen = false;
		
		spielFeld.zeichne();
		
		while(!gewonnen){
			
			
			StdOut.println("In welche Spalte wollen Sie setzen?");
			int spalte = StdIn.readInt();
			
			farbe = spielFeld.legeStein(spalte-1, farbe);
			spielFeld.zeichne();
			gewonnen = spielFeld.gewonnen();
		}

	}

}
