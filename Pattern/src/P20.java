import java.util.Scanner;

public class P20 {

public static void main(String[] args) {
	
	Scanner scn = new Scanner(System.in);
	
	int n1 = scn.nextInt();
	
	for(int i = 1; i<=n1 ; i++)
	{
	
		for(int j =1 ; j<=n1;j++)
			{
			if(j==1 || j==n1)
			{
				System.out.print("*\t");
			}
			else if(i>n1/2 && (i==j || i+j==n1+1))
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
