package Logical_Program;

public class RemoveDigitFromeString2 
{
	public static void main(String[] args) 
	{
		String s1="Vijay13";
		String s2="";
		for(int i=0;i<=s1.length()-1;i++)
		{
			 char str2=s1.charAt(i);
		     
			 if(!Character.isDigit(str2))
			 {
				 s2=s2+str2;
			 }
		}
			 System.out.println (s2);
		}
}
