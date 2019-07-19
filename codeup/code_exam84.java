package codeup;

import java.util.Scanner;

public class code_exam84 {

	public static void main(String[] args) {
		int r,g,b;
		Scanner a = new Scanner(System.in);
		r = a.nextInt();
		g = a.nextInt();
		b = a.nextInt();
		
		for(int k=0; k<r; k++)
		{
			for(int j=0; j<g; j++)
			{
				for(int i = 0; i<b; i++)
				{
					System.out.print(k+" ");
					System.out.print(j+" ");
					System.out.println(i);
				}
			}
		}
		System.out.print(Math.round(r*Math.pow(g, b)));
	}

}
