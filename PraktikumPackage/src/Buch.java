
public class Buch {
	
	private String name;
	private int artikelnr;
	private double preis;
	private int bestand;
	
	public Buch(String name, int artikelnr, double preis, int bestand){
		
		this.name = name;
		this.artikelnr = artikelnr;
		this.preis = preis;
		this.bestand = bestand;
	}
	
	public String getName(){
		return this.name;
	}
	public int getArtikelnr(){
		return this.artikelnr;
	}
	public double getPreis(){
		return this.preis;
	}
	public int getBestand(){
		return this.bestand;
	}
	public void setPreis(double preis){
		this.preis = preis;
	}
	public void setBestand(int bestand){
		this.bestand = bestand;
	}
	public String toString(){
		return "Name: " + name + ", Artikelnr: " + artikelnr + ", Preis: " + preis + "E , Bestand: " + bestand; 
	}
	
	public static double berechneDurchschnitsspreis(Buch[] buecher){
		double dpreis = 0;		
		for(int i=0;i<buecher.length;i++){
			if(buecher[i] != null){
			dpreis+=buecher[i].getPreis();
			}
		}
		dpreis = dpreis/(buecher.length);
		dpreis = (Math.round(dpreis*100));
		dpreis = dpreis/100;
		return dpreis;
	}
}