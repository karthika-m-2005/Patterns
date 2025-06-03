package Patterns;

import java.util.Scanner;

public class PatternF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int printvalue = 1;
		for(int row = 1;row<=n;row++)
		{
			for(int col = 1;col<=row;col++)
			{
				System.out.print(printvalue+" ");
				printvalue++;
			}
			System.out.println();
		}
		sc.close();

	}

}
