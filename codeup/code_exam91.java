package codeup;

import java.util.Scanner;

public class code_exam91 {

	public static void main(String[] args) {
		int num1, num2, num3, num4;
		Scanner a = new Scanner(System.in);
		num1 = a.nextInt();
		num2 = a.nextInt();
		num3 = a.nextInt();
		num4 = a.nextInt();
		
		for(int i=1; i< num4; i++)
		{
			num1 *= num2;
			num1 += num3;
		}
		System.out.print(num1);

	}

}
