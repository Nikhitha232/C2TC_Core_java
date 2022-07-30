package tnsif.c2tc;
import java.util.concurrent.ConcurrentHashMap;
public class concurrentHashmapExample {
public static void main(String[]args) {
	ConcurrentHashMap<Integer,String>map=new ConcurrentHashMap<>();
	map.put(703,"Archana");
	map.put(704,"Nikitha");
	map.put(715,"Thanu");
	map.put(706,"Poorna");
	System.out.println(map);
	map.remove(704);
	System.out.println("print individual items");
	for(Integer key:map.keySet())
	{
		System.out.println(map.get(key));
	}
	map.put(706, "Roopa");  
			System.out.println("print individual item using keyset");
			for(Integer key:map.keySet())
			{
				System.out.println(map.get(key));
		}
			map.put(715, "thanu");
			System.out.println(map);
			map.put(null, "thanu");
			System.out.println(map);
			map.put(715, null);
			System.out.println(map);
			map.put(null,null);
			System.out.println(map);
	}

	
	
}

