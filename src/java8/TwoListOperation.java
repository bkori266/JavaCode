package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TwoListOperation {
	
	public static void main(String[] args) {
		List<Integer> num1=Arrays.asList(1,2,3,4,5,6);
		List<Integer> num2=num1;
	
		List<Integer> num1_num2=Stream.of(num1,num2).flatMap(List::stream).collect(Collectors.toList());
		System.out.println(num1_num2);
		
		Optional<Integer> ans=null;
	
		ans=num1_num2.stream().reduce((a,b)->a+b);
		System.out.println("Using reduce method: "+ans);
		
		
	}

	
}
