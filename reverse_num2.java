package Logical_Program;

public class reverse_num2 
{
   public static void main(String[] args) 
   {
	  int orgnum=3456;
	  int revnum=0;
	  
	  for(int i=orgnum;i>0; i=i/10)
	  {
		   int rev=i%10;
		   revnum=revnum*10+rev;
	  }
	  System.out.println(revnum);
}
}
