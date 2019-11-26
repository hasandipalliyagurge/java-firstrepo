import java.util.*;
class SumDigit{
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        int sum=0;
        int x;
        System.out.print("Input an integer : ");
        int num=input.nextInt();
        while(num!=0){
			x=num%10;
			num=num/10;
			sum=sum+x;
			
		}
		System.out.println(sum);
		
    }
}
