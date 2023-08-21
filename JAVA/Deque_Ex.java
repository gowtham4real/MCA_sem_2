import java.util.*;
public class Deque_Ex 
{
	public static void main(String args[])
	{
		Deque<String> dq=new LinkedList<String>();
		dq.add("and vegetable");
		dq.addFirst("Fruit");
		dq.addLast(" are");
		System.out.println("Initial deque :");
		System.out.println(dq +" ");
		
		dq.push("A");
		dq.offer("Good");
		dq.offerFirst("Daily");
		dq.offerLast("for health");
		System.out.println("\nDeque:");
		System.out.print(dq + " ");
		
		System.out.println("\n Deque contents using Standard Iterator:");
		Iterator it=dq.it();
		while (it.hasNext())
			System.out.println(" "+iterator.next());
			
		Iterator reverse=dq.descendingIterator();
		System.out.println("\nDeque contents using reverse iterator :");
		while (reverse.hasNext())
			System.out.println(" "+ reverse.next());
		
	}
}

