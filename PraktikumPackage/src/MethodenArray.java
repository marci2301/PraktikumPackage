
public class MethodenArray {
	
	public static void wiederholeZeichen(char c, int anzahl){
		
		for(int i=0;  i<anzahl; i++){
			StdOut.print(c);
		}
	}
	
	public static int frageInt(String s){
		StdOut.println(s);		
		int i = StdIn.readInt();
		
		return i;		
	}
	
	public static int frageInt(String s, int min, int max){
		StdOut.println(s);		
		int i = StdIn.readInt();
		
		while(i<min || i>max){
			StdOut.println("Zahl liegt ausserhalb des Wertebereichs. Geben Sie eine neue Zahl ein: ");
			i = StdIn.readInt();
		}
		return i;
	}
	
	public static int[] frageInt(String s, int gr){
		StdOut.println(s);
		int [] a = new int[gr];
		
		for(int i=0; i<gr; i++){
			StdOut.println((i+1) + ". Zahl eingeben: ");
			a[i] = StdIn.readInt();
		}		
		return a;
	}
	
	public static int maximum(int a, int b){
		int max = Math.max(a, b);
		return max;
	}
	
	public static int maximumArray(int[]a){
		int max = 0;
		for(int i=0; i<a.length; i++){
			max = MethodenArray.maximum(a[i], max);
		}
		return max;
	}
	
	public static int[] arrayUmkehren(int[]a){
		int[] b = new int[a.length];
		
		for(int i=0; i<a.length; i++){
			b[i]=a[a.length-i-1];
		}
		return b;
	}
}