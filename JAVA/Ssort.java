import java.util.*;
class Ssort
{
public static void main(String arg[])
{
String str[]=new String[10];
Scanner sc=new Scanner(System.in);
System.out.print("Enter Strings: ");
for(int i=0;i<str.length;i++){
str[i]=sc.next;
}
Ssort obj=new Ssort();
obj.sorting(str);
}
void sorting(String str[]){
for(int i=0;i<str.length
