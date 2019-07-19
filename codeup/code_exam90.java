package codeup;//등비수열값 구하기

import java.util.Scanner;

public class code_exam90 {

	public static void main(String[] args) {
		int num1, num2, num3;
		Scanner a = new Scanner(System.in);
		num1 = a.nextInt();
		num2 = a.nextInt();
		num3 = a.nextInt();
		
		for(int i=1; i<num3; i++)
		{
			num1 *= num2;
		}
		System.out.print(num1);

	}

}
