import java.util.*; //?
class Example{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in); //?
		int x,y,z;
		System.out.print("Input  number 1: ");
		x=input.nextInt();
		System.out.print("Input  number 2: ");
		y=input.nextInt();
		
		z=x+y;
		
		System.out.println(x+" + "+y+" = "+z); //100 + 200 = 300
	}
}
