package tnsif.c2tc.entities;

public class Demo1 extends Thread {
@Override
public void run() {
for(int i=0;i<5;i++)
{
	try {
		Thread.sleep(1010);
	} catch (InterruptedException e) {
		}
		System.out.println("hi");
}
}
}
