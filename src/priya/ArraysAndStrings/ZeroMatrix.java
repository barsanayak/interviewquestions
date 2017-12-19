/**
 * 
 */
package priya.ArraysAndStrings;

import java.util.ArrayList;

/**
 * @author Priya
 * 
 * Write an algorithm such that if an element in an MxN matrix is 0, 
 * its entire row and column are set to 0.
 *
 */
public class ZeroMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix =new int[][]{{1,2,0},{4,5,6},{7,8,9},{0,3,2}};
		zero1(matrix, matrix.length, matrix[0].length);
		
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[i].length;j++)
			{
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}

	}
	
	public static void zero(int[][] matrix, int m, int n)
	{
		
		ArrayList<Integer> rows=new ArrayList<Integer>(m);
		ArrayList<Integer> columns=new ArrayList<Integer>(n);
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(matrix[i][j]==0)
				{
					rows.add(i);
					columns.add(j);
				}
			}
		}
		
		//zero out rows
		for(int i=0;i< rows.size();i++)
		{
			for(int j=0;j<n;j++)
			{
				matrix[rows.get(i)][j]=0;
			}
		}
		
		//zero out columns
		for(int i=0;i< columns.size();i++)
		{
			for(int j=0;j<m;j++)
			{
				matrix[j][columns.get(i)]=0;
			}
		}
		
	}
	
	
	//O(1) space
	public static void zero1(int[][] matrix, int m, int n)
	{
		
		//ArrayList<Integer> rows=new ArrayList<Integer>();
		//ArrayList<Integer> columns=new ArrayList<Integer>();
		boolean colZero=false, rowZero=false;
		
		//check first row and column for zeros
		for(int i=0;i<m;i++)
		{
			if(matrix[i][0] == 0)
			{
				colZero=true;
			}
		}
		for(int j=0;j<n;j++)
		{
			if(matrix[0][j] == 0)
			{
				rowZero=true;
			}
		}
		
		//check zeros in other cells and update first row and column
		for(int i=1;i<m;i++)
		{
			for(int j=1;j<n;j++)
			{
				if(matrix[i][j]==0)
				{
					matrix[i][0]=0;//column
					matrix[0][j]=0;//row
				}
			}
		}
		
		//zero out rows based on values in first column
		for(int i=1;i<m;i++)
		{
			if(matrix[i][0]==0)
				nullifyRow(matrix,i);
		}
		//zero out columns based on values in first row
		for(int j=1;j<n;j++)
		{
			if(matrix[0][j]==0)
				nullifyColumn(matrix,j);
		}
		
		//nullify first row and column based on boolean values
		if(rowZero)
			nullifyRow(matrix, 0);
		
		if(colZero)
			nullifyColumn(matrix, 0);
		
		
		
	}
	
	private static void nullifyRow(int[][] matrix,int i)
	{
		for(int j=0;j<matrix[0].length;j++)
		{
			matrix[i][j]=0;
		}
	}
	private static void nullifyColumn(int[][] matrix,int j)
	{
		for(int i=0;i<matrix.length;i++)
		{
			matrix[i][j]=0;
		}
	}

}
