package tnsif.c2tc.entities;

public class Main {

	public static void main(String[] args) {
		/**Display d=new Display() {
			@Override
			public void show() {
				System.out.println("hello niki");
			}
		};
		d.show();**/
		Display d=()->{
			System.out.println("hello");
		};
		d.show();

	}

}
