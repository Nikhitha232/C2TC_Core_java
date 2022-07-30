package tnsif.c2tc;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
	Map<Integer,String> map=new HashMap();
	map.put(101, "Nikhitha");
	map.put(102, "Thanu");
	map.put(103, "Poorna");
	System.out.println("print all values");
	System.out.println(map);
	map.remove(102);
	System.out.println("print individual items");
	for(Map.Entry<Integer,String>m:map.entrySet())
	{
		System.out.println(m);
	}
	map.put(103,"Anki");
	
		

	}

}
