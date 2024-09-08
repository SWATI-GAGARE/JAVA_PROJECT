package Logical_Program;

public class Ex13_Reverse_EvenIndexWordINsatatment 
{
	public static void main(String[] args) 
	{
		
	String s1="my name is abc";
	String []ar=s1.split(" ");  //my(0) name(1) 
	
	for(int i=0;i<=ar.length-1;i++)
	{
		String org=ar[i];
		if(i%2==0)
		{
			String rev= reverseString(org);
			System.out.println(rev+" ");
		}
		else
		{
			System.out.println(org+" ");
		}
	}
	}

	public static String reverseString(String org)
	{
		String rev="";
		for(int j=org.length()-1;j>=0;j--)
		{
			rev=rev+org.charAt(j);
         }
		
		return rev;
	}
			
}
