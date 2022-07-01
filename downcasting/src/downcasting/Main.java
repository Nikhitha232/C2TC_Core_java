package downcasting;

public class Main extends Mobile {
	void calling()
	{
		System.out.println("calling by samsung");
	}
	void camera()
	{
		System.out.println("photos and videos");
	}


public static void main (String args[])
{
	Mobile m= new Main();
	Main m1=(Main)m;
	m1.calling();
	m1.camera();
}
}
