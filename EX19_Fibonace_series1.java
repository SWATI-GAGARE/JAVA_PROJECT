package Logical_Program;

public class EX19_Fibonace_series1 
{
	public static void main(String[] args)
	{
		int num1=0;
		int num2=1;
		int num3 = 0;
		int count=10;
		
		for(int i=0;i<=10;i++)
		{
			System.out.println(num1+num2);
		
		num1=num2;
		num2=num3;
		}
	}

}
