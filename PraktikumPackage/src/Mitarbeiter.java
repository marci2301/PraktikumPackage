
public class Mitarbeiter extends Person {
	
	int persnr;
	double gehalt;
	
	public Mitarbeiter(String vorname, String nachname, String gebdatum, int persnr, double gehalt) {
		super(vorname, nachname, gebdatum);
		this.persnr = persnr;
		this.gehalt = gehalt;
	}

	public int getPersnr() {
		return persnr;
	}

	public void setPersnr(int persnr) {
		this.persnr = persnr;
	}

	public double getGehalt() {
		return gehalt;
	}

	public void setGehalt(double gehalt) {
		this.gehalt = gehalt;
	}

	@Override
	public String toString() {
		return super.toString() + " Personalnr: " + persnr + ", Gehalt: " + gehalt;
	}

}
