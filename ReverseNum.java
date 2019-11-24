import java.util.*;
class ReverseNum {
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        System.out.print("Input an integer : ");
        int num=input.nextInt();
        //System.out.println(num);
        //find the reverse 
        
        int reverse=0;
        
        int x1,x2,x3;
        /*x1=num%10;
        System.out.print(x1);
        num=num/10;
        
        x2=num%10;
        System.out.print(x2);
        num=num/10;
        
         x3=num%10;
        System.out.println(x3);
        num=num/10; */
        
        while(num!=0){
			reverse=num%10;
			System.out.print(reverse);
			num=num/10;
		}
        System.out.println("");
    }
}
