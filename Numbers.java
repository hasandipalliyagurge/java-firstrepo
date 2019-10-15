import java.util.*;
class Numbers
{
	public static void main(String args[]){
		double d;
		d=0.000000000000000000000000000000000343;
		System.out.println("d  : "+d);		
		
		d=2147483647; //max of int
		System.out.println("d  : "+d);		

		//d=2147483648; //max of int+1
		
		d=2147483648L; //max of int+1
		System.out.println("d  : "+d);				

		d=9223372036854775807L; //max of long
		System.out.println("d  : "+d);						

		d=9223372036854775808D; //max of long +1
		System.out.println("d  : "+d);								
	}
)
