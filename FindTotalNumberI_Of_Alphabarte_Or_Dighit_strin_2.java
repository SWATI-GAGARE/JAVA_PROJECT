package Logical_Program;

public class FindTotalNumberI_Of_Alphabarte_Or_Dighit_strin_2 
{
	public static void main(String[] args) 
	{
		String str1="SB $% ** 3565 hftrsb";
		
		int countlatter=0;
		int countDigit=0;
		int countspace=0;
		int countspaclchar=0;
		
		for(int i=0;i<=str1.length()-1;i++)
		{
			 char str2=str1.charAt(i);
			 if(Character.isLetter(str2))
			 {
				 countlatter++;
			 }
			 else if(Character.isDigit(str2))
			 {
				 countDigit++;
			 }
//			 else if(Character.isSpaceChar(str2))
//			 {
//				 countspaclchar++;
//			 }
			 else if(Character.isWhitespace(str2))
			 {
				 countspace++ ;
			 }
	
		}
		System.out.println("count the Latter:"+countlatter);
		System.out.println("count the digit:"+countDigit);
		System.out.println("count the spacial char:"+countspaclchar);
		System.out.println("count the whitw spaces:"+countspace);
	}

}
