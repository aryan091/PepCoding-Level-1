import java.util.Scanner;



public class SearchIn2DMatrix {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int size = scn.nextInt();

		
		int [][] search = new int[size][size]; 
		
		for (int i = 0; i < search.length; i++) {
			for (int j = 0; j < search[0].length; j++) {
				
				search[i][j] = scn.nextInt(); 
				
			}
		}
		
		int data = scn.nextInt();
		
		int i = 0 ; 
		int j = search.length-1;
		
		while(i < search.length && j >= 0)
		{
			
			if(search[i][j] == data)
			{
				System.out.println(i);
				System.out.println(j);
				return;
			}
			else if(data < search[i][j])
			{
				j--;
			}
			else
			{
				i++;
			}
		}
		
		System.out.println("Not Found");
	}
	
}
