import java.util.*;
class Reverse2 {
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        System.out.print("Input an integer : ");
        int num=input.nextInt();
        //System.out.println(num);
        //find the reverse 
        
        int reverse=0;
        
        
        int x;
        /*x1=num%10;
        //System.out.print(x1);
        num=num/10;
        
        x2=num%10;
        //System.out.print(x2);
        num=num/10;
        
         x3=num%10;
        //System.out.println(x3);
        num=num/10;
        
        reverse=((x1*10 + x2)*10+x3)/10;
        */
        
        while(num!=0){
			
			x=num%10;
			
			reverse=reverse*10;
			reverse=reverse+x;
			num=num/10;
			
			
			
		}
        System.out.println(reverse);
    }
}
