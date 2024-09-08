package Logical_Program;

public class EX5_FindTotalNumberI_Of_Alphabarte_Or_Dighit_instring 
{
	public static void main(String[] args) 
	{
		String str="AB  00  C34  6896ghhui5@@@    ";
		 int countLetter=0;
		 int countDigit=0;
		 int countWhitSpace=0;
		 int countSpclChar=0;
		 for(int i=0;i<=str.length()-1;i++)
		 {
			 char str2=str.charAt(i);
			if(Character.isLetter(str2))
			{
				countLetter++; //1
			}
			else if(Character.isDigit(str2))
			{
				countDigit++;
			}
			else if(Character.isWhitespace(str2))
			{
				countWhitSpace++;
			}
			else
			{
				 countSpclChar++;
			}
			
		 }
		 System.out.println("Letter count="+countLetter);
		 System.out.println("Digit count= "+countDigit);
		 System.out.println("count white space="+countSpclChar);
		 
		 System.out.println("SpacialChar= "+countSpclChar);
	}

}
