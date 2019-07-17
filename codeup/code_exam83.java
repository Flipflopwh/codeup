package codeup;

import java.util.Scanner;

public class code_exam83 {

	public static void main(String[] args) {
		int game;
		Scanner a = new Scanner(System.in);
		game = a.nextInt();
		
		
		for(int i=1; i<=game; i++)
		{
			String clap = String.valueOf(i);
			boolean num = false;
			for(int j=0; j <clap.length(); j++)
			{
				char chk = clap.charAt(j);
				if(chk == '3' || chk == '6' || chk =='9')
				{
					System.out.print("¦");
					num = true;
				}
			}
			if(!num)
			{
				System.out.print(clap);
			}
			if(i % 10 == 0)
			{
				System.out.println();
			}
			else
			{
				System.out.print(" ");
			}
			
		}
				
	}
}
