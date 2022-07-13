package tnsif.c2tc.entities;

public class Demo extends Thread {
	@Override
	public void run() {
		//System.out.println(5/0);//
		for(int i=0;i<5;i++)
		{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
			}
		System.out.println("Hello");
	}

}
}