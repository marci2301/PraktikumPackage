
public class VierGewinnt {
	
	private static boolean farbe = false;

	public static void main(String[] args) {
		
		SpielFeld2 spielFeld = new SpielFeld2();
		
		spielFeld.zeichne();
		
		while(true){
			
			StdOut.println("In welche Spalte wollen Sie setzen?");
			int spalte = StdIn.readInt();
			farbe = spielFeld.legeStein(spalte-1, farbe);
			spielFeld.zeichne();
		}

	}

}
