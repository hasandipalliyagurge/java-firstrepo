import java.util.*;
class TwoDARAY2 {
	public static void main(String args[]) {
		
		int[][] marks=new int[4][];//
		System.out.println(marks[0]+" "+marks[1]); //null null
		marks[0]=new int[4];
		marks[1]=new int[3];
		marks[2]=new int[5];
		marks[3]=new int[2];
		
		Scanner input=new Scanner(System.in);
		for (int i = 0; i < marks.length; i++){
			System.out.println("Input marks for student"+(i+1)+"... ");
			for(int j=0; j<marks[i].length; j++){
				System.out.print("\tSub "+(j+1)+" : ");
				marks[i][j]=input.nextInt();
			}
		}
		
		//Print marks
			for (int i = 0; i < marks.length; i++)
		{
			for (int j = 0; j < marks[i].length; j++){
				System.out.print("[ "+marks[i][j]+"]"+" ");
			}
			System.out.println();
		}
		
		
		
	}
}
