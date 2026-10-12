package solidPrincipal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Pair pair=InputProcess.process();
		int n1=0;int n2=0;
		
		
		if(!ValidCheck.isValid(pair)) {
			System.out.println("One of them is invalid");
			return;
		}
		
		n1=Integer.valueOf(pair.getFirstNumber());
		n2=Integer.valueOf(pair.getSecondNumber());
		
		
		System.out.print(Operation.sum(n1, n2));
		

	}

}
