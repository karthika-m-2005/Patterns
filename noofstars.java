 import java.util.Scanner;

public class noofstars {

	public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
		System.out.println("Enter the how many stars you want: ");
		int n = sc.nextInt();
		for(int i =1;i<=n;i++)
		{
			System.out.print("*");
		}
		sc.close();

	}

}
