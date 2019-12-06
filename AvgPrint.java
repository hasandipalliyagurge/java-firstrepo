import java.util.*;
class AvgPrint {
	public static boolean isPass(double a){
		boolean pass;
		if(a>=50)
		{
			pass=true;
		}
		else{
		pass= false;
	}
		return pass;
	}

	
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.print("Input student average marks : ");
		double avg=input.nextDouble();
		if(isPass(avg)){
			System.out.println("Pass");
		}else{
			System.out.println("Fail");
		}
	}
}
