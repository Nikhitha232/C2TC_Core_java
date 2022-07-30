package tnsif.c2tc;

import java.util.List;
import java.util.Stack;

public class client {

	public static void main(String[] args) {
	List <String> list=new Stack();
	Stack<String> Stack=(Stack<String>)list;
	Stack.push("nikitha");
	Stack.push("thanu");
	Stack.push("poorna");
System.out.println(Stack);
System.out.println("remove");
    ((java.util.Stack) Stack).pop();
for(String str:Stack)
	System.out.println(str);

	}

}
