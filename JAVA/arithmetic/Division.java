package arithmetic;
import java.util.*;
public  class Division implements base
{
	double a,b;
	public Division(double a,double b)
	{
		this.a=a;
		this.b=b;
		}
	public void div()
	{
		System.out.println(a+"/"+b+"="+(a/b));
	}
	public void add(){}
	public void sub(){}
	public void mul(){}
}
