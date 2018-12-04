
public class SpielStein {
	boolean istSchwarz;
	
	public SpielStein(boolean istSchwarz){
		this.istSchwarz = istSchwarz;
	}
	
	boolean istSchwarz(){
		return istSchwarz;
	}
	
	public void zeichne(double xPos, double yPos, double groesse){
		if(istSchwarz){
			StdDraw.setPenColor(StdDraw.BLACK);
		}
		else{
			StdDraw.setPenColor(StdDraw.BOOK_RED);
		}
		
		StdDraw.filledCircle(xPos, yPos, groesse);
	}
}