
import java.util.*;
class  Codeblock2{

	public static void main(String args[]){
		int x=100,y=99;
		boolean b=x==y;
		System.out.println(x=y);
		System.out.println(x==y);
		System.out.println(b);
		System.out.println(b=true);
		System.out.println(b==true); //dont type like this
		System.out.println(b=x==y);
		//System.out.println(b=x=y==100);
		System.out.println(b=(x=y)==100);
	}
}



 
