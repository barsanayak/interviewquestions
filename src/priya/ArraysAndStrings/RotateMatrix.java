/**
 * 
 */
package priya.ArraysAndStrings;

/**
 * @author Priya
 * 
 * Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, 
 * write a method to rotate the image by 90 degrees. Can you do this in place?
 *
 */
public class RotateMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix =new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		rotate(matrix);
		
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[i].length;j++)
			{
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}

	}
	
	public static void rotate(int[][] matrix)
	{
		if(matrix.length==0 || matrix.length !=matrix[0].length)
			return;
		
		/*
		 * temp=top[i]
		 * top[i]=left[i+n]
		 * left[i+n]=bottom[i+n]
		 * bottom[i+n]=right[i]
		 * right[i]=temp
		 * 
		 */
		
		int len=matrix.length;
		
		for(int round=0;round<len/2;round++)
		{
			int firstIndex=round;
			int lastIndex=len-1 - round;
			
			for(int i=firstIndex;i<lastIndex;i++)
			{
				//value by which index drifts from first cell
				int diff=i-firstIndex;
						
				//save top
				int temp=matrix[firstIndex][i];
				
				//top = left
				matrix[firstIndex][i]=matrix[lastIndex-diff][firstIndex];
				
				//left = bottom
				matrix[lastIndex-diff][firstIndex] = matrix[lastIndex][lastIndex-diff];
				
				//bottom = right
				matrix[lastIndex][lastIndex-diff] = matrix[i][lastIndex];
				
				//right = top
				matrix[i][lastIndex] = temp;
				
			}
		}
		
		
	}

}
