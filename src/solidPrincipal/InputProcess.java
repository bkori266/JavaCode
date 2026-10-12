package solidPrincipal;

import java.util.Scanner;

public class InputProcess {
	
	
	public static Pair process() {
		Scanner sc=new Scanner(System.in);
		
		String num1=sc.nextLine();
		String num2=sc.nextLine();
		
		sc.close();
		
		Pair pair=new Pair(num1, num2);
		return pair;
	}
	
	
	
	

}
