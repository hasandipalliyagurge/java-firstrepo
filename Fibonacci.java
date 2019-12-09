import java.util.*;
class Fibonacci {
	public static void printFibonnaciUpto(int n){
		int fib;
		for(int i=0; i<=n; i++){
		if(i==0 ){
			fib=0;
		}
		else  if(i==1){
			fib=1;
			
		}
		else{
			fib=(i-1)+(i-2);
			//fib=(printFibonnaciUpto(i)-1)+(printFibonnaciUpto(i-2);
			//fib=printFibonnaciUpto(n-1)+printFibonnaciUpto(n-2);
			
		}
		System.out.println(fib);
	}
	}
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.print("Input an integer : ");
		int num=input.nextInt();
		printFibonnaciUpto(num); //0, 1, 1, 2, 3, 5,  8, 13, 21......
	}
}

