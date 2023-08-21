import java.util.HashSet;

public class Hash_set
{
	public static void main(String args[])
	{
		HashSet<String> cars = new HashSet<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("BMW");
		cars.add("Mazda");
		for (String i : cars)
		{
			System.out.println(i);
		}
		System.out.println(cars.contains("Mazda"));
		cars.remove("Volvo");
		
		System.out.println(cars);
	
		
	}
}
