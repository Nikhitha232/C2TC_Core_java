package tnsif.c2tc;
import tnsif.c2tc.entities.Student;
public class Main {

	public static void main(String[] args) {
		Runnable t=new Student();
		Thread thread=new Thread(t);
		thread.start();

	}

}
