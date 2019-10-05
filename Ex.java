import java.util.*; 
class Ex{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in); 
		int x,y;
		System.out.print("Input number 1 : ");
		x=input.nextInt();
		System.out.print("Input number 2 : ");
		y=input.nextInt();
		System.out.println(x+"  "+y); //12 13
		//
		//Insert codes here
		//
		x=x+y; //25
		y=x-y;
		
		x=x-y;
		
		
		System.out.println(x+"  "+y); //13 12
	}
}
