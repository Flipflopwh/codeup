package codeup;

import java.util.Scanner;

public class code_exam80 
{
	public static void main(String[] args) 
	{
		int i = 1; 
		Scanner a = new Scanner(System.in);
		 Scanner b = new Scanner(System.in);
		 //char c = a.next().charAt(0);
		int n = b.nextInt();
		 int sum = 0;
		
		while(true)
		{
			sum += i;
			if(n <= sum)
			{
				System.out.print(i);
				break;
			}
			i++;
		}
		return;
	}
}