public class Pattern3 {

	public static void main(String[] args)
	{
		int n = 8;
		for(int i  = 1;i<=n;i++)
		{
			
			  for(int j  = 1;j<=n;j++)
			  {
				    System.out.print((i==1||i==n||j==1||j==n)?"*":" ");
				   
			  }
			 
			  System.out.println("");
		}
	}

}













