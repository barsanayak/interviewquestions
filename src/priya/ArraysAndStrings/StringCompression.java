/**
 * 
 */
package priya.ArraysAndStrings;

/**
 * @author Priya
 * 
 * Implement a method to perform basic string compression using the counts of repeated characters. 
 * For example, the string aabcccccaaa would become a2blc5a3. 
 * If the "compressed" string would not become smaller than the original string, your method should 
 * return the original string. You can assume the string has only uppercase and lowercase letters(a - z).
 *
 */
public class StringCompression {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(compress("aabcccccaaab"));

	}
	
	
	public static String compress(String str)
	{
		StringBuilder sb=new StringBuilder();
		
		int count=0;
		for(int i=1;i<str.length();i++)
		{
			if(str.charAt(i) == str.charAt(i-1))
			{
				count++;
			}
			else
			{
				sb.append(str.charAt(i-1));
				sb.append(++count);
				count=0;
			}
			if(i==str.length()-1)
			{
				sb.append(str.charAt(i));
				sb.append(++count);
			}
		}
		
		if(sb.length()>str.length())	
			return str;
		
		return sb.toString();
	}
	
	

}
