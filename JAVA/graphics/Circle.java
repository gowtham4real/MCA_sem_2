package graphics;
import java.util.*;
public class Circle implements properties
{
	double r;
	public Circle(double r)
	{
		this.r=r;
		
	}
	public void area()
	{
	System.out.println("area :"+ Math.PI*r*r);
	}
	public void perimeter()
	{
	System.out.println("Perimeter :"+ 2*Math.PI*r);
	}
}
	
