import java.util.Scanner;
public class AnyBaseToDec {
	
	public static int anyBaseToDec(int n, int b)
	{
		int rv = 0;
		
		int power = 1;
		
		while(n>0)
		{
			int dig = n % 10;
			n = n / 10;
			
			rv = rv + dig * power;
			power = power * b;
		}
		
		return rv;
		
	}
	
	public static void main(String[] args) {
		
Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		int b = scn.nextInt();
		
		int ans = anyBaseToDec(n,b);
		System.out.println("The conversion  of number "+n+" with base "+b+" is :"+ans);
	}

}
