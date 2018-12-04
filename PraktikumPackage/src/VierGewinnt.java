
public class VierGewinnt {

	public static void main(String[] args) {
		
		SpielFeld2 spielFeld = new SpielFeld2();
		spielFeld.zeichne();
		
		while(true){
			StdOut.println("In welche Spalte wollen Sie setzen?");
			int spalte = StdIn.readInt();
			spielFeld.legeStein(spalte, true);
			spielFeld.zeichne();
		}

	}

}
