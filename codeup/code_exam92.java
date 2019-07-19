package codeup;

import java.util.Scanner;

public class code_exam92 {

	public static void main(String[] args) {
		int men1, men2, men3;
		Scanner a = new Scanner(System.in);
		men1 = a.nextInt();
		men2 = a.nextInt();
		men3 = a.nextInt();
		
		
		int day=1;
		while(day%men1!=0 && day%men2!=0 && day%men3!=0)
		day++; 
		System.out.printf("%d", day);

	}

}
