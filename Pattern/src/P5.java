import java.util.Scanner;

public class P5 {
	
	public static void main(String[] args) {
		
Scanner scn = new Scanner(System.in);
		
		int n1 = scn.nextInt();
		
		int sp = n1/2;
		int st = 1;
		
		for(int i = 1 ; i<=n1;i++)
		{
			for(int j = 1 ;j<=sp;j++)
			{
				System.out.print("\t");
			}
			for(int j = 1 ;j<=st;j++)
			{
				System.out.print("*\t");
			}
			for(int j = 1 ;j<=sp;j++)
			{
				System.out.print("\t");
			}
			System.out.println();
			if(i>n1/2)
			{
				sp++;
				st=st-2;
			}
			else
			{
				
				sp--;
				st=st+2;
				
			}
			
		}
		
		
 
		
	}

}
