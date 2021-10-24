import java.util.Scanner;

public class TheStateOfWakanda2 {

	
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

		
		int [][] twodArray = new int[size][size]; 
		
		for (int i = 0; i < twodArray.length; i++) {
			for (int j = 0; j < twodArray[0].length; j++) {
				
				twodArray[i][j] = scn.nextInt(); 
				
			}
		}
		
		for(int gap = 0; gap<twodArray.length;gap++)
		{
			for(int i = 0 ,  j = gap ; j < twodArray.length;i++,j++)
			{
				System.out.println(twodArray[i][j]);
			}
		}
		
		
	}
	
}
