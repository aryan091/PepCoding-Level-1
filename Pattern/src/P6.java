import java.util.Scanner;

public class P6 {
	
	public static void main(String[] args) {
		
Scanner scn = new Scanner(System.in);
		
		int n1 = scn.nextInt();
		
		int sp = 1;
		int st = n1/2+1;
		
		for(int i = 1 ; i<=n1;i++)
		{
			for(int j = 1 ;j<=st;j++)
			{
				System.out.print("*\t");
			}
			for(int j = 1 ;j<=sp;j++)
			{
				System.out.print("\t");
			}
			for(int j = 1 ;j<=st;j++)
			{
				System.out.print("*\t");
			}
			System.out.println();
			
			if(i<=n1/2)
	        {   
	            sp = sp + 2;
	            st--;
	        }
	        else
	        {
	            st++;
	            sp = sp - 2;
	        }
		
			
		}
		
		
 
		
	}

}

