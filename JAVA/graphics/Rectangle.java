package graphics;
import java.util.*;
public class Rectangle implements properties
{
	double a,b;
	public Rectangle(double a,double b)
	{
		this.a=a;
		this.b=b;
	}
	
	public void area()
	{
	System.out.println("Area of rectangle :"+ a*b);
	}
	public void perimeter()
	{
	System.out.println("Perimeter of Rectangle :"+ 2*(a+b));
	}
	
}
