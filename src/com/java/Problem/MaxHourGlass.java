package com.java.Problem;

public class MaxHourGlass {
	
	public static int maxHourGlass(int mat[][],int r,int c)
	{
		int max_sum=Integer.MIN_VALUE;
		if(r<3||c<3)
		{
			return -1;
		}
		else {
			for(int i=0;i<r-2;i++)
			{
				for(int j=0;j<c-2;j++)
				{
				int	sum=(mat[i][j]+mat[i][j+1]+mat[i][j+2])+(mat[i+1][j+1])+(mat[i+2][j]+mat[i+2][j+1]+mat[i+2][j+2]);
				max_sum=Math.max(max_sum, sum);
				}
			}
			
		}
		return max_sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
