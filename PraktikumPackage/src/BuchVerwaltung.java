
public class BuchVerwaltung {

	public static void main(String[] args) {

//		StdOut.println("Anzahl der Buecher eingeben: ");
//		int z  = StdIn.readInt();
//		Buch[] buecher = new Buch[z];
//		
//		for(int i=0; i<z; i++){
//			StdOut.println("Name vom " + (i+1) + ". Buch: ");
//			String name = StdIn.readString();
//			StdOut.println("Artikelnr vom " + (i+1) + ". Buch: ");
//			int artikelnr = StdIn.readInt();
//			StdOut.println("Preis vom " + (i+1) + ". Buch: ");
//			double preis = StdIn.readDouble();
//			StdOut.println("Bestand vom " + (i+1) + ". Buch: ");
//			int bestand = StdIn.readInt();
//			
//			buecher[i] = new Buch(name, artikelnr, preis, bestand);
//		}
		
		Buch[] buecher = new Buch[5];
		buecher[0] = new Buch("Buch 1", 111, 9.99, 100);
		buecher[1] = new Buch("Buch 2", 122, 33.50, 50);
		buecher[2] = null;
		buecher[3] = new Buch("Buch 4", 144, 45.49, 33);
		buecher[4] = new Buch("Buch 5", 155, 19.99, 75);
		
		for(int i=0;i<buecher.length; i++){
			if(buecher[i] != null){
			StdOut.println(buecher[i].toString());
			}
		}
		
		StdOut.println("Durchschnittspreis : " + Buch.berechneDurchschnitsspreis(buecher) + " Euro");
	}
}