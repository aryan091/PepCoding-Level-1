import java.util.Scanner;


public class RingRotate {
	
	public static void Display(int [][] a)
	{
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				
				System.out.print(a[i][j]+" "); 
				
			}
			System.out.println();
		}
	}
	
	public static void rotate(int [][]a , int s , int r)
	{
		int [] oneD = fillOneDfromShell(a,s);
		rotateArray(oneD , r);
		fillShellFromOneD(a , s ,oneD);
	}
	
	public static void fillShellFromOneD(int [][]a,int s , int []oneD)
	{
		int minr = s - 1;
		int minc = s - 1;
		int maxr = a.length-s;
		int maxc = a[0].length-s;
		
		
		
		
		int idx = 0;

		
		
		// LEFT WALL

		
		for(int i = minr ,  j=minc ; i <= maxr;  i++ )
		{
			 a[i][j]=oneD[idx] ;
			idx++;
		}
		
		minc++;
		
		// BOTTOM WALL
		
		
		for(int i = maxr ,  j=minc ; j <= maxc;  j++ )
		{
			 a[i][j]=oneD[idx] ;
				idx++;
		}
		maxr--;
		
		
		for(int i = maxr ,  j=maxc ; i >= minr;  i-- )
		{
			 a[i][j]=oneD[idx] ;
				idx++;
		}
		
		maxc--;
		
		for(int i = minr ,  j=maxc ; j >= minc;  j-- )
		{
			 a[i][j]=oneD[idx] ;
				idx++;
		}
		
		minr++;
		

	}
	
	public static int [] fillOneDfromShell(int [][] a, int s)
	{
		int minr = s - 1;
		int minc = s - 1;
		int maxr = a.length-s;
		int maxc = a[0].length-s;
		int size = 2 * (maxr - minr + maxc - minc);
		
		
		
		int idx = 0;
		int [] oneD = new int[size];
		
		
		// LEFT WALL

		
		for(int i = minr ,  j=minc ; i <= maxr;  i++ )
		{
			oneD[idx] = a[i][j];
			idx++;
		}
		
		minc++;
		
		// BOTTOM WALL
		
		
		for(int i = maxr ,  j=minc ; j <= maxc;  j++ )
		{
			oneD[idx] = a[i][j];
			idx++;
		}
		maxr--;
		
		
		for(int i = maxr ,  j=maxc ; i >= minr;  i-- )
		{
			oneD[idx] = a[i][j];
			idx++;
		}
		
		maxc--;
		
		for(int i = minr ,  j=maxc ; j >= minc;  j-- )
		{
			oneD[idx] = a[i][j];
			idx++;
		}
		
		minr++;
		
		
		return oneD;
	}
	
	public static void rotateArray(int [] oneD, int r)
	{
		r= r % oneD.length;
		if(r<0)
		{
			r= r + oneD.length;
		}
		
		reverse(oneD , 0 ,oneD.length-r-1 );
		reverse(oneD ,oneD.length-r,oneD.length-1 );
		reverse(oneD , 0 ,oneD.length-1 );
	}
	
	public static void reverse(int [] oneD, int low , int high)
	{
		while(low < high)
		{
			int temp = oneD[low];
			oneD[low] = oneD[high];
			oneD[high] = temp;
			low++;
			high--;
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int row = scn.nextInt();
		int coloumn = scn.nextInt();
		
		int [][] spiralArray = new int[row][coloumn]; 
		
		for (int i = 0; i < spiralArray.length; i++) {
			for (int j = 0; j < spiralArray[0].length; j++) {
				
				spiralArray[i][j] = scn.nextInt(); 
				
			}
		}
		
		int shell = scn.nextInt();
		int rotate = scn.nextInt();
		
		Display(spiralArray);
		
		rotate(spiralArray,shell,rotate);
		System.out.println();
		Display(spiralArray);
		
		
	}

}
