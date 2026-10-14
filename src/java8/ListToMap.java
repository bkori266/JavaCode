package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListToMap {

	public static void main(String[] args) {
		List<Integer> number=Arrays.asList(1,2,3,4);
		
		System.out.println(number.stream().collect(Collectors.toMap(a->String.valueOf(a)+"Key", a->a)));
		
	}

}
