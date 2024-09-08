package Logical_Program;
public class Ex3_RemoveDighitFromString1 
{
   public static void main(String[] args)
   {
	  String str="SRVH345DIUB";
	  String str1="";
      
	  for(int i=0;i<=str.length()-1;i++)
	  {
		  char s1=str.charAt(i);
		  
		  if(!Character.isDigit(s1))      //charater!=dighit
		  {                               //( digit !=s------)-----true ,(dighit=s)------false
			 str1=str1+s1;                //(char !=2)------true,(char=2)--false
		  }
	  }
	  System.out.println(str1);
}
}
