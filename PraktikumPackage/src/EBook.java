
public class EBook extends Buch{
	
	double gr;
	String format;
	
	public EBook(String name, int artikelnr, double preis, int bestand, double gr, String format){
		
		super(name, artikelnr, preis, bestand);
		this.gr = gr;
		this.format = format;		
	}
	
	public String toString(){
		return super.toString() + " Groesse: " + gr + " Format: " + format;
	}
}
