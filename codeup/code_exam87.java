package codeup;

import java.util.Scanner;

public class code_exam87 {

	public static void main(String[] args) {
		int num;
		Scanner a = new Scanner(System.in);
		num = a.nextInt();
		
		int sum = 0;
		
		
		if(num<=100000)
		{
			int i =1;
			while(true)
			{
				if(sum >= num)break;
				else
				{
					sum += i;
					i++;
				}
				
			}
			System.out.print(sum);
		}
	}

}
