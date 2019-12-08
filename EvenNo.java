import java.util.*;
class EvenNo {
		public static boolean isEven(int num){
		return num%2==0;
	}
	public static void main(String args[]) {
		Random r=new Random();
		for (int i = 0; i < 10; i++){
			int num=r.nextInt(101);
			System.out.println(num+" : "+(isEven(num) ? "number is even" : "Number is odd"));
		}
	}
}
	
	
	
	/*public static boolean isEven(int n){
		if(n%2==0){
			return true;
		}
		else
		return false;
	}
	public static void main(String args[]) {
		Random r=new Random();
		for (int i = 0; i < 10; i++){
			int rand=r.nextInt();
			System.out.println(isEven(rand) ? "number is event" : "Number is odd");
		}
	}
}*/
/*public static void main(String args[]) {
		Random r=new Random();
		for (int i = 0; i < 10; i++){
			int rand=r.nextInt();
			int count=findDigitCount(rand);
			System.out.println("No of digits for "+rand+" : "+count);
		}
	}
}*/


