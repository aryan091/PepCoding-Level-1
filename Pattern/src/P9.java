import java.util.Scanner;

public class P9 {
	
	public static void main(String[] args) {
		
Scanner scn = new Scanner(System.in);
		
		int n1 = scn.nextInt();
		
		int sp = n1-1;
		int st = 1;
		
		for(int i = 1 ; i<=n1;i++)
		{
			for(int j = 1 ; j<=n1;j++)
			{
			if(i+j==n1+1 || i==j)	
			{
			
				System.out.print("*\t");
			}
			else
			{
				System.out.print("\t");
			}
				
			}
			System.out.println();
			
		}
		
		
 
		
	}

}