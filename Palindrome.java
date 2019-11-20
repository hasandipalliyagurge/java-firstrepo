import java.util.*;
class Example {
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        for(int i=0; i<10000;i++){
			int num=i;
			int reverse=0;
			while(num!=0){
				reverse*=10;
				reverse+=num%10;
				num/=10;
			}
			if(i==reverse){
				System.out.println(reverse);
			}
		}
	}
}
