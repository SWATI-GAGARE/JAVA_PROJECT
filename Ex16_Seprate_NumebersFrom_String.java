package Logical_Program;

public class Ex16_Seprate_NumebersFrom_String 
{
   public static void main(String[] args) 
   {
	  String s1="abcd123";
	  String s2=s1.substring(4);
	  
	  int n1=Integer.parseInt(s2);
	  System.out.println(n1+7);
}
}
