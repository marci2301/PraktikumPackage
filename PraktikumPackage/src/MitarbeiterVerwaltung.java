
public class MitarbeiterVerwaltung {

	public static void main(String[] args) {

		Person p1 = new Person("Mr", "X", "01.01.1999");
		Student s1 = new Student("Marcel", "Müller", "23.01.1996", 1182624, 150);
		Mitarbeiter m1 = new Mitarbeiter("Mitarbeiter", "Eins", "31.12.1850", 1234, 4200);
		Professor prof1 = new Professor("Professor", "Eins", "30.02.1960", 5678, 6000, "Informatik");
		
		Person [] pArray = new Person[4];
		pArray[0] = p1; 
		pArray[1] = s1;
		pArray[2] = m1;
		pArray[3] = prof1;				
		
		for(int i=0; i<pArray.length; i++) {
			
			if(pArray[i] instanceof Professor) {
				
				StdOut.println(pArray[i].toString() + "ist Professor!");
			}
			else if(pArray[i] instanceof Mitarbeiter) {
				
				StdOut.println(pArray[i].toString() + "ist Mitarbeiter!");
			}			
			else if(pArray[i] instanceof Student) {
				
				StdOut.println(pArray[i].toString() + "ist Student!");
			}
			else {
				StdOut.println(pArray[i].toString());
			}
		}
	}
}
