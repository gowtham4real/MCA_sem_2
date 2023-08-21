import java.util.*;
public class Hash_Set_Compare
{
	public static void main(String args[])
	{
	HashSet<String> h_set1  = new HashSet<String>();
	h_set1.add("Red");
	h_set1.add("Green");
	h_set1.add("Black");
	h_set1.add("White");
	
	HashSet<String> h_set2 =new HashSet<String>();
	h_set2.add("Red");
	h_set2.add("Pink");
	h_set2.add("Orange");
	h_set2.add("Black");
	
	HashSet<String> h_set3 =new HashSet<String>();
	h_set3.add("Red");
	h_set3.add("Pink");
	h_set3.add("Black");
	h_set3.add("Orange");
	
	HashSet<String>result_set = new HashSet<String>();
	System.out.println("Comparing values of h_set1 and h_set3 ");
	for(String element : h_set1)
	{
	System.out.println(h_set3.contains(element)? "yes" : "no");
	}
	System.out.println("After comparing h_set2 and h_set3 =" + h_set2.equals(h_set3));
	boolean check=h_set1.equals(h_set3);
	System.out.println("After comparing h_set1 and h_set3 =" +check);
	}
}
