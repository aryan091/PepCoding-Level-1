import java.util.Scanner;

public class P2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		
		int sp = n1-1;
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
			sp--;
			st++;
			System.out.println();
		}
		
		
 
	}

}
