package tnsif.c2tc;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
public static void main(String[] args) {
List<String> list = Arrays.asList("Ram", "Ravi", "Krishna");
CopyOnWriteArrayList<String> c = new CopyOnWriteArrayList<String>(list);
System.outprintln("without modification="+c);
Iterator<String>iterator1=c.iterator();
c.add("hi");
System.out.println("After modification="+c);
Iterator<String>iterator2=c.iterator();
System.out.println("Elements from first iterator:");
iterator1.forEachRemaining(System.out::println);
System.out.println("Elements from second iterator:");
iterator2.forEachRemaining(System.out::println);
}
}


