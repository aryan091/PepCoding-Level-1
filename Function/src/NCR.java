o[;lpiiimport java.util.Scanner;

public class NCR {
	
	public static int fctorial(int n)
	{
		int rv = 1 ;
		for(int i = 1 ; i<=n;i++)
		{
			rv  = rv * i; 
		}
		return rv;
	}
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int N = scn.nextInt();
		int R = scn.nextInt();
		
		int nfact = fctorial(N);
		int nmrfact = fctorial(N-R);
		
		System.out.println(N+"P"+R+"="+nfact/nmrfact);
		
		
		
	}

}
