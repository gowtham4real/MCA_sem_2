import java.util.*;

class Person{
	
	public int aadhar_no;
	
	public String name;
	
	Person(int aadhar_no,String name){
		
		this.aadhar_no=aadhar_no;
		
		this.name=name;
	}
	
	class Address{
		
		int houseno;
		
		String house_name;
		
		String place;
		
		Address(int houseno,String place){
			
			this.houseno=houseno;
			
			this.place=place;
		
		}
		
		void display(){
		
			System.out.println("House No: "+houseno);
			
			System.out.println("Place: "+place);
			
		}
	
	}
	
	static class Occupation{
		
		static String company;
		
		static String designation;
		
		Occupation(String company,String designation){
		
			this.company = company;
			
			this.designation=designation;
		}
		
		static void display(){
			
			System.out.println("Company name: "+company); 
			
			System.out.println("Designation: "+designation);
			
		}
		
	}
	
	public void display(){
	
		System.out.println("Aadhar no: "+aadhar_no);
		
		System.out.println("Name: "+name);
		
	}
	
}

class PersonMain{

	public static void main(String[] args){
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Aadhar No: ");
		
		int aadhar_no=sc.nextInt();
		
		System.out.println("Enter the Name: ");
		
		String name=sc.next();
		
		Person p=new Person(aadhar_no,name);
		
		System.out.println("Enter the House Number: ");
		
		int house_no=sc.nextInt();
		
		System.out.println("Enter the Place: ");
		
		String place=sc.next();
		
		Person.Address a=p.new Address(house_no,place);
		
		System.out.println("Enter the Company Name: ");
		
		String company=sc.next();
		
		System.out.println("Enter the Designation: ");
		
		String designation=sc.next();
		
		System.out.println("-----------------------------------------");
		
		Person.Occupation o=new Person.Occupation(company,designation);
		
		p.display();
		
		a.display();
		
		o.display();
		
		
	}
	
}
