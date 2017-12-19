/**
 * 
 */
package priya.ArraysAndStrings;

/**
 * @author Priya
 * 
 * Write a method to replace all spaces in a string with '%20' 
 * You may assume that the string has sufficient space at the end to hold the additional characters,
 * and that you are given the "true" length of the string. 
 * (Note: If implementing in Java,please use a character array so that you can perform this operation in place.)
 *
 */
public class URLify {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Mr John Smi th      ";
		System.out.println(urlify(str.toCharArray(), 14));
		
	}
	
	public static String urlify(char[] arr, int length)
	{
		//count num of spaces = spaceCount
		//replace each space with 3 chars %20
		//so total length after replacement = length + spaceCount*3 -spaceCount
		
		int spaceCount=0;
		for(int i=0;i<length;i++)
		{
			if(arr[i]==' ')
				spaceCount++;
		}
		int finalIndex=length-spaceCount+(spaceCount*3) - 1;
		
		for(int i=length-1;i>=0;i--)
		{
			if(arr[i]!=' ')
			{
				arr[finalIndex]=arr[i];
				finalIndex--;
			}
			else
			{
				arr[finalIndex--]='0';
				arr[finalIndex--]='2';
				arr[finalIndex--]='%';
			}	
		}
		
		return new String(arr);
	}

}
