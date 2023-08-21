import java.util.*;
import graphics.*;
class Main
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length :");
	double l=sc.nextDouble();
	System.out.println("Enter the breadth :");
	double b=sc.nextDouble();
	Rectangle R=new Rectangle(l,b);
	R.area();
	R.perimeter();
	System.out.println("Enter the radius :");
	double r=sc.nextDouble();
	Circle C=new Circle(r);
	C.area();
	C.perimeter();
	}
}
	
	
	
	 
