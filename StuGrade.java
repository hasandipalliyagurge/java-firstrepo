import java.util.*;
class StuGrade {
	public static char findStudentGrade(double a){
		char grade;
		if(a<=35){
			grade='D';
		}
		else if(a<=50){
			grade='c';
		}
		else if(a<=70){
			grade='B';
	    }
	    else
			grade='A';

	return grade;
	}

	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.print("Input student average marks : ");
		double avg=input.nextDouble();
		char grade=findStudentGrade(avg);
		System.out.println(avg+" : "+grade);
	}
}
