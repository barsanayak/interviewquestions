/**
 * 
 */
package priya.ArraysAndStrings;

/**
 * @author Priya
 * 
 * Assumeyou have a method isSubstringwhich checks if one word is a substring of another. 
 * Given two strings, sl and s2, write code to check if s2 is a rotation of sl using 
 * only one call to isSubstring (e.g.,"waterbottle" is a rotation of"erbottlewat").
 *
 */
public class StringRotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isRotation("erbottlewat", "waterbottle"));

	}
	
	public static boolean isRotation(String s1, String s2)
	{
		//check if s2 is a rotation of s1
		if(s1.length()!=s2.length())
			return false;
		
		s1+=s1;
		return isSubString(s1, s2);
	}
	
	private static boolean isSubString(String s1,String s2)
	{
		//return false;
		return true;
	}

}
