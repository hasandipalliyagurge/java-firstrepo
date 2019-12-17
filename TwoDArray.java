import java.util.*;
class TwoDArray {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.print("Input number of students -");
		final int N=input.nextInt();
		System.out.print("Input number of students -");
		final int S=input.nextInt();

		int[][] marks=new int[N][S];
		
		Random r=new Random();
		for (int i = 0; i < N; i++)
		{
			for (int j = 0; j < S; j++)
			{
				marks[i][j]=r.nextInt(100)+1;
			}
			
		}
		
		for (int i = 0; i < N; i++)
		{
			for (int j = 0; j < S; j++){
				System.out.print("[ "+marks[i][j]+"]"+" ");
			}
			System.out.println();
		}
		
		
		
}
}
