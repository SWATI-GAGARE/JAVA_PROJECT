package Logical_Program;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class EX18_Diffrence_Between_HashSet_HashMap_TreSet 
{
	public static void main(String[] args) 
	{
		//order of insertion :Accending orderof Asci value
		HashMap<Integer,String>mp=new HashMap<>();
		mp.put(101,"ramesh");
		mp.put(102,"swati");
		mp.put(103,"vijay");
		System.out.println(mp);
		
		System.out.println("------------------");
		
		//order of insertion---maintained
		LinkedHashMap<Integer,String>mp2=new LinkedHashMap<>();
		mp2.put(101,"ramesh");
		mp2.put(102,"swati");
		mp2.put(103,"vijay");
		System.out.println(mp2);
		
		//order of insertion-----Asending Order
		TreeMap<Integer,String>Trmp=new TreeMap();
		Trmp.put(101,"ramesh");
		Trmp.put(102,"swati");
		Trmp.put(103,"vijay");
		System.out.println(Trmp);
	}
}
	