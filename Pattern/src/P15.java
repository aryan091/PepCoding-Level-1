import java.util.Scanner;

public class P15 {
	
	public static void main(String[] args) {
		
Scanner scn = new Scanner(System.in);
		
		int n1 = scn.nextInt();
		
		int sp = n1/2;
		int st = 1;
		int val = 1;
		for(int i = 1 ; i<=n1;i++)
		{
			
			for(int j = 1 ;j<=sp;j++)
			{
				System.out.print("\t");
			}
			int cval = val;
			for(int j = 1 ;j<=st;j++)
			{
				System.out.print(cval+"\t");
				if(j<=st/2)
				{
					cval++;
				}
				else
				{
					cval--;
				}
				
			}
		
			System.out.println();
			
			if(i<=n1/2)
			{
				

				sp--;
				st=st+2;
				val++;
			}
			else
			{
				sp++;
				st=st-2;
				val--;
			}
		
			
		}
		
		
 
		
	}

}
