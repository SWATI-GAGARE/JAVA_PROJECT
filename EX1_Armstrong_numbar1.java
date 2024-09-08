package Logical_Program;

public class EX1_Armstrong_numbar1 
{
   public static void main(String[] args)
   {
	  int org=153;
	  int sum=0;
	     //  i=150  150>0
	  for(int i=org;i>0;i=i%10)
	  {
		  int rem=i/ 10; //150%10=0
		   
		   sum=sum+(rem*rem*rem);
		   
		   System.out.println(sum);
		   if( org==sum)
		   {
			  System.out.println("number is Armstrong"); 
		   }
		   else 
		   {
			   System.out.println("number is not Amstrong");
		   }
	  }
	  
}
}
