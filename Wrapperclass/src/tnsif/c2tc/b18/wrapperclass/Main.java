package tnsif.c2tc.b18.wrapperclass;

public class Main {

	public static void main(String[] args) {
	int a=10;
	Integer obj=a;
	Integer num=new Integer(30);
	a=num;
	String ttTrainer="niki";
	String t= ttTrainer;
	String s=new String("thanu");
	ttTrainer=s;
	System.out.println(obj);
	System.out.println(a);
	System.out.println(t);
	System.out.println(ttTrainer);

	}

}
