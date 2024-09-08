package Logical_Program;

public class Reverse_String2 
{
	public static void main(String[] args) 
	{
	
	String num="gagare";
	String rev="";
	
	for(int i=num.length()-1;i>=0;i--)
	{
		rev=rev+num.charAt(i);
	}
	System.out.println("reveres string ="+rev);

}
}
