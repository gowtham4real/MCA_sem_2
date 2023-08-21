class Call2
{	public static void main(String args[])
	{	Sum s1=new Sum(3,4);
		s1.add();
	}
}
class Sum
{	int a,b,tot;
	Sum(int x,int y)
	{	a=x;
		b=y;
		System.out.println("Inside Constructor");
	}
void add()
{	tot=a+b;
	System.out.println(tot);
}
}
