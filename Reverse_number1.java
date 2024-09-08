package Logical_Program;

public class Reverse_number1
{
	public static void main(String[] args)
	{
		int orgnum=12345;
		int revnum=0;
		
		for(int i=orgnum;i>0;i=i/10)
		{
			 int rev=i%10;  //=5
			 revnum=revnum*10+rev;
		}
		System.out.println(revnum);
	}

}
