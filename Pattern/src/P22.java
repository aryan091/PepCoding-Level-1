import java.util.Scanner;

public class P22 {
	
	public static void main(String[] args) {
		
Scanner scn = new Scanner(System.in);
		
		int n1 = scn.nextInt();
		
		
		int st = n1;
		int sp=0;
		
		for(int i = 1 ; i<=n1;i++)
		{
			for(int j = 1 ; j<=sp;j++)
			{
				System.out.print("\t");
			}
			
			for(int j = 1 ; j<=st;j++)
			{
				if(i>n1/2 && i<n1 && j>1 && j <st)
				{
					System.out.print("\t");
				}
				else
				{
				System.out.print("*\t");
				}
			}
			System.out.println();
			if(i<=(n1/2))
			{
				st=st-2;
				sp++;
			}
			else
			{
				st=st+2;
				sp--;
			}
			
		}
		
		
	}

}
