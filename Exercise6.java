import java.util.*;
class Exercise6 {
    public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.print("Input upper bound- ");
		int u=input.nextInt();
		
		System.out.print("Input lower bound- ");
		int l=input.nextInt();
		
		if(u<l){
			System.out.println("[empty]");
		}
		else if(u==l){
			System.out.println(u);
		}
		else
		{
			System.out.print("[");
			for(int i=l; i<=u; i++)
			{
				System.out.print(i+", ");
			}
			System.out.println("\b\b]");
		}

		
}

}

