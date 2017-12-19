/**
 * 
 */
package priya.ArraysAndStrings;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Priya
 * 
 * Given a string, write a function to check if it is a permutation of a palin­drome. 
 * A palindrome is a word or phrase that is the same  forwards and backwards. 
 * A permutation is a rearrangement of letters. 
 * The palindrome does not need to be limited to just dictionary words.
 *
 */
public class PalindromePermutation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindromePermutation("lamaaMaly"));

	}
	
	public static boolean isPalindromePermutation(String str)
	{
		if(str.length()<2)
			return true;
		
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		str=str.toLowerCase();
		
		for(int i=0;i<str.length();i++)
		{
			if(map.containsKey(str.charAt(i)))
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			else
				map.put(str.charAt(i), 1);
		}
		
		boolean middleCounted=false;
		for(Map.Entry<Character, Integer> entry: map.entrySet())
		{
			if(((entry.getValue()%2 != 0) && !middleCounted))
				middleCounted=true;
			else if(entry.getValue()%2 != 0 && middleCounted)
				return false;
				
		}
		return true;
	}

}
