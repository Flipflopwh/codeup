package codeup;

import java.util.Scanner;

public class code_exam81 {

	public static void main(String[] args) {
		int dice1, dice2;
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		dice1 = scan1.nextInt();
		dice2 = scan2.nextInt();
		
		int i = 1, j = 1;
		int sum1 = 0, sum2 = 0;
		
		
		
		while(true)
		{
			if(dice1 <=10 && dice2 <= 10)
			{
				for(i=1; i<=dice1; i++)
				{
					if(dice2 >= sum2)
					{
						if(dice1 >= sum1)
						{
							for(j=1; j<=dice2; j++)
							{
								System.out.print(i+" ");
								System.out.println(j);
							}	
						}
					}
				}
				
			}
			else
			{
				System.out.print("Please enter less than 10 digits.");
			}
			break;
			
			
		}
	}
}
