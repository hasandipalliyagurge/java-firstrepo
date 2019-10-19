
import java.util.*;
class Currency{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input a salary : ");
		int salary=input.nextInt();
		
		//find no of coins and notes
		int r5000,r2000,r1000,r500,r100,r50,r20,r10,r5,r2,r1;
				
		r5000=salary/5000;		
		salary=salary%5000;
		System.out.println("No. of r5000 notes= "+r5000);
		
		r2000=salary/2000;
		salary=salary%2000;
		System.out.println("No. of r2000 notes= "+r2000);
		
		r1000=salary/1000;
		salary=salary%1000;
		System.out.println("No. of r2000 notes= "+r1000);
		
		r500=salary/500;
		salary=salary%500;
		System.out.println("No. of r500 notes= "+r500);
		
		r100=salary/100;
		salary=salary%100;
		System.out.println("No. of r2000 notes= "+r100);
		
		r50=salary/50;
		salary=salary%50;
		System.out.println("No. of r2000 notes= "+r50);
		
		r20=salary/20;
		salary=salary%20;
		System.out.println("No. of r20 notes= "+r20);
		
		r10=salary/10;
		salary=salary%10;
		System.out.println("No. of r10 coins= "+r10);
		
		r5=salary/5;
		salary=salary%5;
		System.out.println("No. of r5 coins= "+r5);
		
		r2=salary/2;
		salary=salary%2000;
		System.out.println("No. of r2 coinns= "+r2);
		
		
		
		System.out.println("No. of r1 coins= "+salary);
	}
}









