import arithmetic.*;
import java.util.*;
class Calculus
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		double x=sc.nextDouble();
		System.out.println("Enter the second number:");
		double y=sc.nextDouble();
		Addition A=new Addition(x,y);
		A.add();
		Subtraction S=new Subtraction(x,y);
		S.sub();
		Multiplication M=new Multiplication(x,y);
		M.mul();
		Division D=new Division(x,y);
		D.div();
	}
}
		
		
		
