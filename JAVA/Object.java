class Object
{	public static void main(String args[])
	{	Sum s1=new Sum(2,3);
		Sum s2=new Sum(3,4);
		Sum s3=new Sum(4,0);
		int p=s1.add();
		int q=s2.add();
		int r=s3.add();
		if((p<q)&&(p<r))
		{	System.out.println("Smallest is "+p);
		}
		else if((q<p)&&(q<r))
		{	System.out.println("Smallest is "+q);
		}
		else
		{	System.out.println("Smallest is "+r);
		}		
	}
}
class Sum
{	int a,b,tot;
	Sum(int x,int y)
	{	a=x;
		b=y;
	}
int add()
{	tot=a+b;
	System.out.println(tot);
	return tot;
}
}
