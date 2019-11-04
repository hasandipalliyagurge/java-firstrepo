import java.util.*;
class Exercise8 {
    public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.print("Input number- ");
		int n=input.nextInt();
		int sum=0;
		if(n==0){
			System.out.println("[Empty]");
		}
		
		else{
		System.out.print("[");
		for (int i = 1; i <= n; i++){
			System.out.print(i+"+");
			sum=sum+i;
		}
		 
		System.out.println("\b]="+sum);
		
	}
		
		
		
		
		
		
}

}
