package tnsif.c2tc;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class withStreamAPI {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	String str[]=new String[5];
	System.out.println("Give the input String");
	for(int i=0;i<5;i++)
		str[i]=scan.next();
	List<String> list=Arrays.asList(str);
	System.out.println("print it space seperated");
	System.out.println(list.stream().collect(Collectors.joining(",")));
	System.out.println("Print it as a list");
	System.out.println(list.stream().collect(Collectors.toList()));
	System.out.println("convert the strings in touppercase and then print it as a list");
	System.out.println(list.stream()
			.map(s->s.toUpperCase())
			.collect(Collectors.toList()));
	System.out.println("Print the string whose length is greater then 2");
	System.out.println(list.stream()
			.filter(s->s.length()>2)
			.collect(Collectors.toList()));
			
	


	}

}
