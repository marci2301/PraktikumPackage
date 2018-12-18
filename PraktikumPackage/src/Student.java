
public class Student extends Person {
	
	int matrikelnr;
	int creditpoints;
	
	public Student(String vorname, String nachname, String gebdatum, int matrikelnr, int creditpoints) {
			
		super(vorname, nachname, gebdatum);
		this.matrikelnr = matrikelnr;
		this.creditpoints = creditpoints;		
	}

	public int getMatrikelnr() {
		return matrikelnr;
	}

	public void setMatrikelnr(int matrikelnr) {
		this.matrikelnr = matrikelnr;
	}

	public int getCreditpoints() {
		return creditpoints;
	}

	public void setCreditpoints(int creditpoints) {
		this.creditpoints = creditpoints;
	}

	@Override
	public String toString() {
		return super.toString() + "Matrikelnr: " + matrikelnr + ", Creditpoints: " + creditpoints;
	}
}
