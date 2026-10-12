package solidPrincipal;

public class ValidCheck {
	
	public static boolean isValid(Pair pair) {
		
		String first=pair.getFirstNumber();
		String second=pair.getSecondNumber();
		
		try {
			Integer.parseInt(first);
			
		}catch(NumberFormatException e) {return false;}
		
		try {
			Integer.parseInt(second);
			
		}catch(NumberFormatException e) {return false;}

		
		return true;
		
	}
	

}
