import java.util.Scanner;

public class P11 {
	
public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int n1 = scn.nextInt();
		
		int val = 1;
		
		for (int i = 0; i < n1; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print(val+"\t");
				val++;
				
			}
			System.out.println();
		}

}
}
