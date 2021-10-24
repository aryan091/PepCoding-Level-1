import java.util.Scanner;

public class P10 {
	
	public static void main(String[] args) {
		
Scanner scn = new Scanner(System.in);
		
		int n1 = scn.nextInt();
		
		int os = n1/2;
		int st = 1;
		int is = -1;
		for(int i = 1 ; i<=n1;i++)
		{
			for(int j = 1 ; j<=os;j++)
			{
				System.out.print("\t");
			}
			for(int j = 1 ; j<=st;j++)
			{
				System.out.print("*\t");
			}
			for(int j = 1 ; j<=is;j++)
			{
				System.out.print("\t");
			}
			if(i>1 && i<n1)
			{
				for(int j = 1 ; j<=st;j++)
				{
					System.out.print("*\t");
				}
			}
			System.out.println();
			
			if(i<=n1/2)
            {
                os--;
                is = is+2;
            }
            else
            {
                os++;
                is = is-2;
            }
			
		}
		
		
 
		
	}

}