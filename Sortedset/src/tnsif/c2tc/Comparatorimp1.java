package tnsif.c2tc;

import java.util.Comparator;

public class Comparatorimp1 implements Comparator<Double> {
	@Override
	public int compare(Double o1,Double o2) {
		if(o2>o1)
			return -1;
		else
			return +1;
		
	}
}

