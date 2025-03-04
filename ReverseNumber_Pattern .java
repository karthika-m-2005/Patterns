import java.util.Scanner;

public class ReverseNumber_Pattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of the Triangle: ");
		int size = sc.nextInt();
		for(int i =1;i<=size;i++)
		{
			for(int j = size;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j = 1;j<=i;j++)
			{
				System.out.print(i);
			}
			
			System.out.println();
		}
		sc.close();
		

	}

}
