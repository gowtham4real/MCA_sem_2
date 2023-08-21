import java.util.Scanner;

class Complex2

{	int r1,r2,rs;

	int i1,i2,is;

	
	void display()

	{	System.out.println("First complex number is:  "+r1+"+"+i1+"i");
	
		System.out.println("Second complex number is:  "+r2+"+"+i2+"i");
		
		System.out.println("Sum of complex numbers:  "+rs+" + "+is+"i");

	}

	void add()

	{	
	
	
		
		Scanner s1=new Scanner(System.in);

		System.out.println("Enter the first real part");

		r1=s1.nextInt();
		
		System.out.println("Enter the second real part");

		 r2=s1.nextInt();


		System.out.println("Enter the first imaginary part");

		 i1=s1.nextInt();
		
		System.out.println("Enter the second imaginary part");

		 i2=s1.nextInt();
		
		rs=r1+r2;

		is=i1+i2;

		
	}

	public static void main(String args[])
	{	

		
		Complex2 c=new Complex2();
		
		c.add();
		
		c.display();
		
		
		
		
	}
}
		
