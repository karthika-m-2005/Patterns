package Patterns;

import java.util.Scanner;

public class PatternE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean pv = false;
		int output = 0;//print value
	
		for(int row = 1;row<=n;row++)
		{
			pv = (row%2==0)?true:false;
            output = (pv)?0:1;
			for(int col = 1;col<=row;col++ )
			{
			    System.out.print(output);
			    pv = !pv;
			    output = (pv)?0:1;
			    
			}
			System.out.println();
		}
		sc.close();

	}

}
