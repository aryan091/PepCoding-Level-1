import java.util.Scanner;

public class P19 {
	
	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		
		int n1 = scn.nextInt();
		
		for(int i = 1; i<=n1 ; i++)
		{
			for(int j = 1 ; j<=n1;j++)
			{
			
			if(i==1)
			{
				if(j==n1 || j <=(n1/2)+1)
				{
				System.out.print("*\t");	
				}
				else
				{
					System.out.print("\t");
				}
			}
			else if(i<=n1/2) 
			{
				if(j==n1 || j ==(n1/2)+1)
				{
				System.out.print("*\t");	
				}
				else
				{
					System.out.print("\t");
				}
			}
			else if(i==n1/2+1)
			{

				System.out.print("*\t");	
				
				
			}
			else if(i<n1) 
			{
				if(j==1 || j ==(n1/2)+1)
				{
				System.out.print("*\t");	
				}
				else
				{
					System.out.print("\t");
				}
			}
			else if(i==n1) 
			{
				if(j==1 || j >=(n1/2)+1)
				{
				System.out.print("*\t");	
				}
				else
				{
					System.out.print("\t");
				}
			}
			
			}
			System.out.println();
		}
		
		
	}

}
