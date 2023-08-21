package arithmetic;
import java.util.*;
public  class Addition implements base
{
	double a,b;
	public Addition(double a,double b)
	{
		this.a=a;
		this.b=b;
	}
	public void add()
	{
		System.out.println(a+"+"+b+"="+(a+b));
	}
	
	public void sub(){}
	public void mul(){}
	public void div(){}
}
