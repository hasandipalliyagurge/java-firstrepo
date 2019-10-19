import java.util.*;
class Codeblock1{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input num 1 : ");
		int num1=input.nextInt();
		
		System.out.print("Input num 2 : ");
		int num2=input.nextInt();
		
		System.out.print("Input num 3 : ");
		int num3=input.nextInt();
		
		System.out.print("Input num 4 : ");
		int num4=input.nextInt();
		
		//find the max
		int max;
		max=num1;
		if(num1>max){
			max=num1;
		}
		if(num2>max){
			max=num2;
		}
		if(num3>max){
			max=num1;
		}
		if(num4>max){
			max=num1;
		}
	
		
		
		
		
		System.out.println("Max : "+max);
	}
}
