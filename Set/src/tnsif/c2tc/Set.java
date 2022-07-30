package tnsif.c2tc;

import java.util.LinkedHashSet;

public class Set {

	public static void main(String[] args) {
		java.util.Set<String>set=new LinkedHashSet<>();
		set.add("Nikitha");
		set.add("Thanu");
		set.add("Rathu");
		System.out.println(set);
		set.add("thanu");
		set.forEach(str->System.out.println(str));
		System.out.println("removing");
		set.remove("thanu");
		System.out.println(set);
		set.clear();
		System.out.println(set);
		set.isEmpty();
		System.out.println(set);
		System.out.println("returns");
		set.toArray();
		System.out.println(set);
		System.out.println("hashcode");
		set.hashCode();
		System.out.println(set);

	}

}
