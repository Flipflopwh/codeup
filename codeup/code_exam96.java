package codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class code_exam96 
{

	public static void main(String[] args) 
	{
		       Scanner sc = new Scanner(System.in);
		       int n= sc.nextInt();
		       int[][] input = new int[20][20];
		       int x,y=0;

		       for(int i=1;i<=n;i++)
		       {
		    	   x = sc.nextInt();
		           y = sc.nextInt();
		           input[x][y] = 1;
		       }
		       
		       for(int i=1;i<=19;i++)
		       {
		           for(int j=1;j<=19;j++)
		           {
		        	   System.out.printf("%d ", input[i][j]);
		           }
		           System.out.println(" ");
		       }
	}
}
