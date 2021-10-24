import java.util.Scanner;

public class P13 {
	
	public static void main(String[] args) {
		
	Scanner scn = new Scanner(System.in);
	
	int n1 = scn.nextInt();
	

	

	
	for (int i = 0; i <n1; i++) {
		int icj = 1 ;
		for (int j = 0; j <=i; j++) {
			System.out.print(icj+"\t");
			int icjp1 = icj*(i-j)/(1+j);
			icj=icjp1;
			
		}
		System.out.println();
	}

	
}
}