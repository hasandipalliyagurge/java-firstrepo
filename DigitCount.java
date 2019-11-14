import java.util.*;
class DigitCount{
     public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        System.out.print("Input an integer : ");
        int num=input.nextInt();
        //find no of digits

        int count=0;
        do{
			num=num/10;
			count++;
		}while(num!=0);
        //
        //
        System.out.println("count : "+count);
    }
}
