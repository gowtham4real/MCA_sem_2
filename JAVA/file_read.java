import java.io.*;
class file_read
{
	public static void main(String args[])throws IOException
	{
	String s="";
		try
		{
		FileReader f1=new FileReader("/home/user/first.txt");
		BufferedReader r=new BufferedReader(f1);
		while((s=r.readLine())!=null)
		{
		System.out.println(s);
		}
		r.close();
		}
		
		catch(IOException e)
		{
		System.out.println(e);
		}
	}
}
	
