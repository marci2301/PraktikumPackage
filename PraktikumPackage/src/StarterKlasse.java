
public class StarterKlasse {

	public static void main(String[] args) {

//		StdOut.println("Geben Sie die das zu wiederholende Zeichen ein: ");
//		char c = StdIn.readChar();
//		StdOut.println("Geben Sie die Anzahl der Zeilen ein: ");
//		int a = StdIn.readInt();
//		
//		//Aufgabe 1b
//		
//		for(int i=0; i<a; i++){
//			Methoden.wiederholeZeichen(c, a);   
//			StdOut.println("");
//		}
//		
//		
//		//Aufgabe 1c
//		
//		for(int i=0; i<a; i++){
//			Methoden.wiederholeZeichen(' ', a-i-1);		
//			Methoden.wiederholeZeichen(c, i*2+1);
//			StdOut.println("");
//		}
//		
//		//Aufgabe 2b
//		
//		Methoden.frageInt("Test");
//		Methoden.frageInt("Test 2: ", 1, 10);
		
		//Aufgabe 2c
		
//		int min = Methoden.frageInt("Geben Sie den MinWert ein: ");
//		int max = Methoden.frageInt("Geben Sie den MaxWert ein: ");
//		int z = Methoden.frageInt("Geben Sie die Anzahl der Zeilen ein: ", min, max);
		
//		for(int i=0; i<z; i++){
//		Methoden.wiederholeZeichen('*', z);   
//		StdOut.println("");
//		}		
		
//		for(int i=0; i<z; i++){
//			Methoden.wiederholeZeichen(' ', z-i-1);		
//			Methoden.wiederholeZeichen('*', i*2+1);
//			StdOut.println("");
//		}
		
		//Aufgabe 2d
//		StdOut.println("Arraygrosse eingeben: ");
//		int gr = StdIn.readInt();
//		int [] a= Methoden.frageInt("Test1: ", gr);
//		
//		for(int i=0; i<a.length; i++){
//			StdOut.print(a[i] + " ");
//		}		
		
		//Aufgabe 3a
//		StdOut.println("Erste Zahl: ");
//		int z1 = StdIn.readInt();
//		StdOut.println("Zweite Zahl: ");
//		int z2 = StdIn.readInt();
//		
//		int max = Methoden.maximum(z1,z2);
//		StdOut.println(max);	
		
		//Aufgabe 3c
//		StdOut.println("Arraygrosse eingeben: ");
//		int gr = StdIn.readInt();
//		int [] a= Methoden.frageInt("Array: ", gr);
//		int max = Methoden.maximumArray(a);
//		StdOut.println("Die grosste Zahl im Array ist: " + max);
//		
		//Aufgabe 4b
		
		StdOut.println("Arraygrosse eingeben: ");
		int gr = StdIn.readInt();
		int [] a= MethodenArray.frageInt("Array: ", gr);
		
		int [] b=MethodenArray.arrayUmkehren(a);
		
		for(int i=0; i<a.length; i++){
		StdOut.print(a[i] + " ");
		}
		StdOut.println("");
		
		for(int i=0; i<a.length; i++){
		StdOut.print(b[i] + " ");
		}		
	}		
}