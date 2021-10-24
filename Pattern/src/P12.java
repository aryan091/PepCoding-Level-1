import java.util.Scanner;

public class P12 {
	
public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int n1 = scn.nextInt();
		
	
		int a = 0 ;
		int b = 1 ;
		
		for (int i = 0; i < n1; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print(a+"\t");
				int c = a + b;
				a=b;
				b=c;
				
			}
			System.out.println();
		}

}

}
