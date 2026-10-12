package java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamAPICode {

	public static void main(String[] args) {
		List<Integer> number=Arrays.asList(1,9,8,11,2,3,4,5,6,7,87,1,3,2,11,9);
		String name="Bipin kori manikchand";
		List<String> nameList=Arrays.asList("bipin","kori","bipin","kori","khan");
	
		
		Collection<Integer> setValues=number.stream()
				.collect(Collectors.toCollection(LinkedHashSet::new));
		
		System.out.println("number: "+number+"\tname: "+name+"\t"+nameList);
		System.out.println("1) Remove dublicatewithout distinct: "+setValues);
		
		System.out.println("2) Sorting: "+number.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

		int max=number.stream().max((a,b)->a-b).get();
		System.out.println("3) Maximum: "+max);
		
		int secondHighest=number.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println("4) Second highest: "+secondHighest);
		
		Map<Character, Long> charCount=name.chars()
									.mapToObj(a->(char)a)
									.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println("5) Char count of name: "+charCount);
		
		Map<String, Long> charCountWord=nameList.stream().collect(Collectors.groupingBy(a->a,Collectors.counting()));
		System.out.println("6) COunt word form List: "+charCountWord);
		
		List<Integer> dublicateNumbers=number.stream().
				collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream().filter(a->a.getValue()>=2).map(a->a.getKey()).collect(Collectors.toList());			
		System.out.println("7) Only dublicate numbers: "+dublicateNumbers);
				
		System.out.println("8) Even and odd groups"+number.stream().collect(Collectors.partitioningBy(a->a%2==0))); 
		
		System.out.println("9) findAny,anyMatch,allMatch: ");
		
		System.out.println(number.stream().filter(a->a%2!=0).findAny().get());
	}
	
	
	

}
