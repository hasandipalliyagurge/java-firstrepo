import java.util.*;
class Factorial {
    public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.print("Input number- ");
		int n=input.nextInt();
		int fact=1;
		
		System.out.print("Factorial= ");
		if(n==0 || n==1){
			fact=1;
			System.out.println(fact);
		}
		
		else{
		System.out.print("[");
		for (int i = 1; i <= n; i++){
			System.out.print(i+"*");
			fact=fact*i;
		}
		 
		System.out.println("\b]="+fact);
		System.out.println(n+"! : "+fact);
		
	}
		
		
		
		
		
		
}

}
