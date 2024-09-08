package Logical_Program;

public class Ex12_Reverse_EachWord_InStatment2

{
  public static void main(String[] args)
  {
	  String s1=" my name is swati";
		String []ar=s1.split(" ");
		for(int i=0;i<=ar.length-1;i++)
		{
			String org=ar[i];
			String rev="";
			for(int j=org.length()-1;j>=0;j--)
			{
			   rev=rev+org.charAt(j);
			}
			System.out.println(rev+" ");
		}
  }
	    public static String reverseString(String org) 
	    {
	      String rev="";
	         
	     for(int i=org.length()-1;i>=0;i--)
	     {
		    rev=rev+org.charAt(i);  
	     }
	     return rev;
	  }
}
