package Logical_Program;
//factorial number means 4!=4*3*2*1
public class Ex10_Factorial_number 
{
	public static void main(String[] args) 
	{
		int num=5;  //5*4=20*3=60*2=120
		int fact=1;
		
		for(int i=num;i>=1;i--)
		{
			fact=fact*i;
			
		}
		System.out.println(fact);
		
	}
}
