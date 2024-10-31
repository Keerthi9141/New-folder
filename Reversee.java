import java.util.Scanner;
class Reversee 
{
public static void main(String [] args)
{
	Scanner s1= new Scanner(System.in);
System.out.println("enter a string ");
String str=s1.nextLine();
char [] arr=str.toCharArray();
String result="";

for(int i=str.length()-1; i>=0; i--)
	{
	result=result+arr[i];
	}
	if(str.equals(result))

	System.out.println(result+ " is a palindrome");
else
	System.out.println("not a palindrome");
}
}