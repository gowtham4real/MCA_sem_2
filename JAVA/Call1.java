class Call1
{	public static void main(String args[])
	{	Sum s1=new Sum();
		s1.add();
	}
}
class Sum
{	int a,b,tot;
	Sum()
	{	a=10;
		b=20;
		System.out.println("Inside Constructor");
	}
void add()
{	tot=a+b;
	System.out.println(tot);
}
}
