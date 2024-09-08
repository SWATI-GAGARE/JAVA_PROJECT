package Logical_Program;

public class Ex9_Print_Statment_IN_ReverseOrder
{
	public static void main(String[] args) 
	{    
		String str="my name is swati";
		String []ar=str.split(" ");
		
		System.out.println("--------------");
		for(int i=ar.length-1;i>=0;i--)	
		{
			System.out.println(ar[i]+" ");
		}
		
	}

}
