
public class Professor extends Mitarbeiter {
	
	String lehrgebiet;
	
	
	public Professor(String vorname, String nachname, String gebdatum, int persnr, double gehalt, String lehrgebiet) {
		
		super(vorname, nachname, gebdatum, persnr, gehalt);
		this.lehrgebiet = lehrgebiet;
	}


	public String getLehrgebiet() {
		return lehrgebiet;
	}


	public void setLehrgebiet(String lehrgebiet) {
		this.lehrgebiet = lehrgebiet;
	}


	@Override
	public String toString() {
		return super.toString() + " Lehrgebiet: " + lehrgebiet;
	}
}
