import java.util.Scanner;

public class SaddlePoint {
	
	public static void Display(int [][] a)
	{
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				
				System.out.print(a[i][j]+" "); 
				
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int size = scn.nextInt();

		
		int [][] saddlePoint = new int[size][size]; 
		
		for (int i = 0; i < saddlePoint.length; i++) {
			for (int j = 0; j < saddlePoint[0].length; j++) {
				
				saddlePoint[i][j] = scn.nextInt(); 
				
			}
		}
		
		for(int i = 0; i<saddlePoint.length;i++)
		{
			int svj  = 0;
			for(int j = 1; j<saddlePoint[0].length;j++)
			{
				if(saddlePoint[i][j]<saddlePoint[i][svj])
				{
					svj = j;
				}
			}
			
			boolean flag  = true;
			
			for(int k = 0; k<saddlePoint.length;k++)
			{
				if(saddlePoint[k][svj]>saddlePoint[i][svj])
				{
					flag = false;
					break;
				}
			}
			
			if(flag == true)
			{
			System.out.println(saddlePoint[i][svj]);
			return;
			}
			
		}
		
		System.out.println("Invalid input");
		
		
		
	}

}
