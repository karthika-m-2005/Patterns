import java.util.Scanner;
public class NumberPattern
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Number:");
int n = sc.nextInt();

for(int i = 1;i<=n;i++)
{
for(int j = n;j<1;j--)
{
System.out.print(i);
}
System.out.println();
}
sc.close();
}
}

