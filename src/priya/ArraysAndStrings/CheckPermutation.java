package priya.ArraysAndStrings;

import java.util.HashMap;
import java.util.Map;

/*
 * @author priya
 * 
 * Given two strings,write a method to decide if one is a permutation of the
other.
 */

public class CheckPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(checkPermutation("test","sett"));

	}
	
	public static boolean checkPermutation(String str1, String str2)
	{
		if(str1.length()!=str2.length())
			return false;
		
		HashMap<Character, Integer> map=new HashMap<>();
		
		for(int i=0;i<str1.length();i++)
		{
			if(map.containsKey(str1.charAt(i)))
				map.put(str1.charAt(i), map.get(str1.charAt(i))+1);
			else
				map.put(str1.charAt(i), 1);
		}
		
		for(int i=0;i<str2.length();i++)
		{
			if(map.containsKey(str2.charAt(i)) && map.get(str2.charAt(i))>0)
				map.put(str2.charAt(i), map.get(str2.charAt(i))-1);
			else
				return false;
		}
		
		/*
		for(Map.Entry<Character, Integer> entry: map.entrySet())
		{
			if (entry.getValue()>0)
				return false;
		}
		*/
		
		return true;
		
	}

}
