class CPU
{	float price;
	CPU(int p)
	{	price=p;
	}
	void display()
	{	System.out.println("Price:"+price);
	}
	class Processor
	{	int noc;
		String manu;
		Processor(int n,String m)
		{	noc=n;
			manu=m;
		}
		void display()
		{	System.out.println("Number of cores:"+noc);
			System.out.println("Manufacturer:"+manu);
		}
	}
	static class RAM
	{	static int mem;
	        static String manuf;
		RAM(int m,String s)
		{	mem=m;
			manuf=s;
		}
		void display()
		{	System.out.println("Memory size:"+mem+" GB");
			System.out.println("Manufacturer:"+manuf);
		}
	}
}
class Nested1
{	public static void main(String args[])
	{	CPU obj=new CPU(10000);
		obj.display();
		CPU.Processor obj1=obj.new Processor(4,"Intel");
		obj1.display();
		CPU.RAM obj2=new CPU.RAM(8,"Micron");
		obj2.display();
	}
}
