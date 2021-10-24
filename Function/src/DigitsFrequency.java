import java.util.Scanner;

public class DigitsFrequency {
	
	public static int frequency(int n, int d)
	{
		int count = 0;
		
		while(n>0)
		{
			int dig = n % 10;
			n = n / 10;
			
			if(dig == d )
			{
				count++;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		int d = scn.nextInt();
		
		int ans = frequency(n,d);
		System.out.println("The frequency  of Digit "+d+" is :"+ans);
		
		
		
	}

}
