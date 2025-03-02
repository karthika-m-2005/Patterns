import java.util.Scanner;
public class RightAngle_Triangle {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the Size of the Right Angle Triangle: ");
	    int Size = sc.nextInt();
	    for(int i = 1;i<=Size;i++)
	    {
	    	for(int j =1;j<=i;j++)
	    	{
	    		System.out.print("* ");
	    	}
	    	System.out.println();
	    }
	    sc.close();

	}

}
