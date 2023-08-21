import java.util.Stack;
public class stack
{
	public static void main(String args[])
	{
		Stack<Integer> stk=new Stack<>();
		boolean res=stk.empty();
		System.out.println("Is Stack empty= "+res);
		stk.push(45);
		stk.push(56);
		System.out.println("Element of stack ="+stk);
		res=stk.empty();
		System.out.println("Is stack empty="+res);
		Integer x=(Integer)stk.pop();
		System.out.println("The value popped from stack is ="+stk);
		stk.push(90);
		System.out.println("elements of stack="+stk);
		x=(Integer)stk.pop();
		System.out.println("the value popped from stack is="+x);
		x=(Integer)stk.pop();
		System.out.println("the value popped from stack is="+x);
		res=stk.empty();
		System.out.println("Is stack empty ="+res);
	}
}
