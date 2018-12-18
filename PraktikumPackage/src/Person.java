
public class Person{
		
	String vorname;
	String nachname;
	String gebdatum;
	
	public Person(String vorname, String nachname, String gebdatum) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.gebdatum = gebdatum;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getGebdatum() {
		return gebdatum;
	}

	public void setGebdatum(String gebdatum) {
		this.gebdatum = gebdatum;
	}

	public String toString() {
		return "Vorname: " + vorname + ", Nachname: " + nachname + ", Geburtsdatum: " + gebdatum;
	}

}
