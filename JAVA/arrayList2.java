import java.io.*;
import java.util.*;

class arrayList2
{
	public static void main(String args[])
	{
		int n=5;
		ArrayList<Integer> a= new ArrayList<Integer>(n);
		for (int i=0;i<n;i++)
			a.add(i*i+5);
			
		System.out.println(a);
		
		a.remove(3);
		System.out.println(a);
		a.remove(2);
		for( int i=0;i<a.size();i++)
			System.out.println(a.get(i) +" ");
		System.out.println("");
	}
}
		
