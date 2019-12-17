import java.util.*;
class TwoDArray3 {
	public static void main(String args[]) {
		
		int[][] marks={{35,76,8,42},{67,68,90},{56,67,45,56,55},{41,42}};
		System.out.println("length of array/ no of arrays/ no of students : "+marks.length);
		
		for (int i = 0; i < marks.length; i++){
			System.out.println("No of subjects for student "+(i+1)+" : "+marks[i].length);
		}
				
				
		//Print marks
		for (int i = 0; i <marks.length ; i++)
		{
			for (int j = 0; j <marks[i].length ; j++)
			{
	     	System.out.print(marks[i][j]+"\t")	;		
			}
			System.out.println();
		}
		
	}
}
