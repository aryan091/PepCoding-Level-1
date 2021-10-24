import java.util.Scanner;
public class AnyToAnyBase {
	
	public static int decToAnyBase(int n, int b)
	{
		int rv = 0;
		
		int power = 1;
		
		while(n>0)
		{
			int dig = n % b;
			n = n / b;
			
			rv = rv + dig * power;
			power = power * 10;
		}
		
		return rv;
		
	}
	
	
	public static int anybaseToDec(int n, int b)
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
	
	public static int convert(int n, int sb , int db)
	{
		
		int decNum = anybaseToDec(n, sb);
		int rv = decToAnyBase(decNum, db);
		
		return rv;
		
	}
	
	public static void main(String[] args) {
		
Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		int sb = scn.nextInt();
		int db = scn.nextInt();
		
		int ans = convert(n,sb,db);
		System.out.println("The conversion  of number "+n+" with  source base"+sb+" is and destination base"+db+" :"+ans);
	}

}
