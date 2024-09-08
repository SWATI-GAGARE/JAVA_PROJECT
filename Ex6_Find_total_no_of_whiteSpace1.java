package Logical_Program;

public class Ex6_Find_total_no_of_whiteSpace1 
{
	public static void main(String[] args) {
		
	String str=" s s s s s";
	int countspace=0;
	
	for(int i=0;i<=str.length()-1;i++)
	{
		   char str1=str.charAt(i);
		    //if(Character.isWhitespace(str1))        //total kiti space aahe
		    if(str1==' ');                             //total kiti aahe
		    {
		    	countspace++;
		    }
    }
	  System.out.println("no of space find:"+countspace);     
	}

}
