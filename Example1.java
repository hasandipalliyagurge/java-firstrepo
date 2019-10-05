import java.util.*; //?
class Example1{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in); //?
		int age;
		System.out.print("Input your age : ");
		age=input.nextInt();
		System.out.println("Your current age : "+age);
		
		age=age+10; //int x=age+10;
					//age=x;
		
		System.out.println("Your age after 10 years : "+age);
	}
}
