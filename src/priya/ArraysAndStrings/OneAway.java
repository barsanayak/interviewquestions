/**
 * 
 */
package priya.ArraysAndStrings;

import java.util.HashMap;


/**
 * @author Priya
 * 
 * There are three types of edits that can be performed on strings: insert a character, 
 * remove a character, or replace a character. 
 * Given two strings, write a function to check if they are one edit (or zero edits) away.
 *
 */
public class OneAway {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isOneEditAway("pale","bales"));

	}
	
	public static boolean isOneEditAway(String str1, String str2)
	{
		if(Math.abs(str1.length()-str2.length()) >1)
			return false;
		
		//if both lengths are equal, we just have to check if there is exactly one character difference(only replacement)
		if(str1.length()==str2.length())
		{
			return isReplacement( str1,  str2);
		}
		
		//if lengths differ by 1, all the characters in shorter string must be there in longer string to return true.
		if(str1.length()>str2.length())
		{
			return isRemoval(str1,str2);//is str2 obtained by removing a character from str1
		}
		else
		{
			return isRemoval(str2, str1);//is str1 obtained by removing a character from str2
		}
		
		
	}
	
	public static boolean isReplacement(String str1, String str2)
	{
		//check if there is exactly one character difference
		
		int diffCount=0;
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)!= str2.charAt(i))
			{
				diffCount++;
				if(diffCount>1)
					return false;
			}
			
		}
		
		return true;
	}
	
	public static boolean isRemoval(String str1, String str2)
	{
		//does str1 contain str2?
		
		int str1Index=0;
		int str2Index=0;
		
		while(str1Index<str1.length() && str2Index<str2.length())
		{
			if(str1.charAt(str1Index) != str2.charAt(str2Index))
			{
				if(str1Index!=str2Index)
					return false;
				
				str1Index++;
				
			}
			else
			{
				str1Index++;
				str2Index++;
			}
			
		}
		
		return true;
	}
	


}
