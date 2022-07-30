package tnsif.c2tc;
import java.util.PriorityQueue;
public class Queue {

	public static void main(String[] args) {
		java.util.Queue<Float> queue =new PriorityQueue<>();
		queue.add(1.2f);
		queue.offer(2.56f);
		queue.add(14.2f);
		queue.offer(8.56f);
		queue.add(25.56f);
		System.out.println(queue);
    //To remove
		queue.remove(14.2f);
		for(Float i: queue)
		{
			System.out.println(i);
		}
		System.out.println("Deletion using polling");
		System.out.println(queue.poll());
		System.out.println("Remaining items");
		queue.forEach(i->System.out.println(i));
		System.out.println("Head of the queue");
		System.out.println(queue.peek());
	}

}
