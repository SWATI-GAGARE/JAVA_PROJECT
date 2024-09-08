package Logical_Program;
//string hai use reverse karnahai or orignal string or reverse string same anha chagiye
public class Ex11_palindrome1 
{
  

public static void main(String[] args)
  {
	
//	  String org="ABCED";
//	  String rev=" ";
//	  
//	  for(int i=org.length()-1;i>=0;i--)
//	  {
//		rev=rev+org.charAt(i);
//	  }
//	  System.out.println(rev);
//	  if(org.equals(rev))
//	  {
//		  System.out.println("this is palindrome mumber");
//	  }
//	  else
//	  {
//		  System.out.println("this is not palindrome number");
//	  }
//	  );
	
	
	String org="ABCDCBA";
	String rev="";
	
	for(int i=org.length()-1;i>=0;i--)
	{
		rev=rev+ org.charAt(i);
	}
	System.out.println(rev);
	if(org.equals(rev)) 
	{
		System.out.println("this is palindrome number");
		
	}
	else {
		System.out.println("this is not palindrome number");
	}

}
}