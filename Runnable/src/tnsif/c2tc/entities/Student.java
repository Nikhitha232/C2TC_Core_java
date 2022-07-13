package tnsif.c2tc.entities;

public class Student extends C2Tc implements Runnable {
	/* void assignment()
	{
		System.out.println("Student has many assignments");
	}*/
@Override
public void run() {
	assignment();	
	}
}
