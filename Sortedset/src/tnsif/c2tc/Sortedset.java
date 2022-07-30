package tnsif.c2tc;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Sortedset {

	public static void main(String[] args) {
		Comparator<Double>cmp=new Comparatorimp1();
		SortedSet<Double> set=new TreeSet<>();
		TreeSet<Double>tset=(TreeSet<Double>)set;
		set.add(67.0);
		set.add(45.9);
		set.add(87.9);
		set.add(89.0);
		System.out.println(set);
		System.out.println(tset.descendingSet());
		System.out.println("retutns");
		set.headSet(67.0);
		System.out.println(set);
		set.first();
		System.out.println(set);

	}

}
