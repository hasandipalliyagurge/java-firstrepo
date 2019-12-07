import java.util.*;
class NoOfDigit {
	
	public static void printNoOfDigits(int a){
		int count=0;
		do{
			a=a/10;
			count++;
		}while(a!=0);
		System.out.println("count : "+count);
	}
	
	//Insert method declaration
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.print("Input an integer : ");
		int num=input.nextInt();
		printNoOfDigits(num);
	}
}
