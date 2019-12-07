import java.util.*;
class PalindromM {
	public static boolean isPalindrome(int n){
		int reverse=0;
		int temp=n, x;
		boolean result;
		 while(temp!=0){
			x=temp%10;
			reverse=reverse*10;
			reverse=reverse+x;
			temp=temp/10;	
			
		}
		if(n==reverse){
			result=true;
		}
		else{
			result=false;
		}
		return result;
	}
	public static void main(String args[]) {
		for (int i = 0; i < 1000; i++){
			if(isPalindrome(i)){
				System.out.println(i);
			}
		}
	}
}
       /* for(int i=0; i<10000;i++){
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
	}*/
