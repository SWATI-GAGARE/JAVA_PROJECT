package Logical_Program;

import java.util.HashMap;
import java.util.Set;

public class Ex17_HasMap_method 
{
	public static void main(String[] args) 
	{
		 HashMap<Integer,String>mp=new HashMap<>();
		 //1;put(key,value)--->to add key and value in map
		 mp.put(101,"ramesh");
		 mp.put(102,"swati");
		 mp.put(103,"vijay");
		 mp.put(104,"ram");
		 mp.put(105,"kaveri");
		 mp.put(106,"nikita");
		 System.out.println(mp);
	//2:put(k,v)--->update value of already existing key
		 mp.put(101,"RAMESH");
		 System.out.println(mp);
   //3:contain key(key)---->to varify the spacific key present or not
		 System.out.println(mp.containsKey(33));
   //4:get(key)----->to get all key from map
		 System.out.println(mp.get(101));
   //5:keyset()--->to get all key from map
   //------------------>return type is set<key>
		 
		 Set<Integer>allkeys=mp.keySet();
		 for(Integer key:allkeys)
		 {
			 System.out.println(key);
			 
		 }
     //6:get all keys&values
		 
		 for(Integer key:allkeys)
		 {
			 System.out.println(key+" "+mp.get(allkeys));
		 }
		 
		 
		 
		 
	}

}
