import java.util.*;
class DigitCountRandom {
	public static int findDigitCount(int r){
	int count=0;
		do{
			r=r/10;
			count++;
		}while(r!=0);
	return count;
	//Insert method declaration
}
	public static void main(String args[]) {
		Random r=new Random();
		for (int i = 0; i < 10; i++){
			int rand=r.nextInt();
			int count=findDigitCount(rand);
			System.out.println("No of digits for "+rand+" : "+count);
		}
	}
}
