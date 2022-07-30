package tnsif.c2tc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		List<Integer> list1=new ArrayList<>();
		Integer num=65;
		list.add(54);
		list.add(num);
		list.add(23);
		list.add(6);
		list.add(67);
		list.add(45);
		System.out.println(list);
		System.out.println("copy numbers");
		list1.addAll(list);
		System.out.println(list1);
		System.out.println("printing single elements");
		for(Integer i:list)
			System.out.println(i);
		System.out.println("printing single elements using Iterator");
		Iterator<Integer>itr=list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println("Remove using index");
		list.remove(1);
		System.out.println(list);
		System.out.println("Remove using object");
		list.remove(num);
		System.out.println(list);
		System.out.println("removing all elements");
		list.remove(list1);
		System.out.println(list);
		list.isEmpty();
		System.out.println(list);
		list.equals(num);
		System.out.println(num);
	    list.toArray();
	    System.out.println(list);
	    System.out.println("sublist");
	    list.subList(1, 2);
	    System.out.println(list);
	    list.spliterator();
	    System.out.println(list);
	    
	}

}
