import java.io.*;
class file_write
{
	public static void main(String args[]) throws IOException
	{
		try
		{
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(r);
		System.out.println("Enter the string :");
		String str=br.readLine();
		FileWriter f=new FileWriter("/home/user/first.txt");
		BufferedWriter wr=new BufferedWriter(f);
		wr.write(str);
		wr.close();
		System.out.println("Succesfully Written to the file ");
		}
		catch(IOException w)
		{
			System.out.println(w);
		}
	}
}
	
