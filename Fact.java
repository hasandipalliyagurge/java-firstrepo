import java.util.*;
class Fact {
	public static int fact(int x){
		int f=1;
		if(x==0 || x==1)
		{
			f=1;
		}else{
			for(int i=1; i<=x; i++){
				f=f*i;
			}
	}
	return f;
}
	//Insert method declaration
	public static void main(String args[]) {
		for (int i = 0; i < 10; i++){
			System.out.println(i+" ! ="+fact(i));
		}
	}
}
