package tnsif.c2tc;
import tnsif.c2tc.entities.*;
public class Main {

	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Demo();
		Thread thread1=new Demo1();
		thread.start();
		thread1.start();
		thread.join();
		thread1.join();
		System.out.println("hello world");
		
      
	}

}
