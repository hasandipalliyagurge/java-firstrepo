import java.util.*;
class AbsValue {
	public static int findAbssolute(int r){
		int abs=1;
		if(r<0){
			abs=r*(-1);
	}
	else{
		abs=r;
	}
		return abs;
	}
	//Insert method declaration
	public static void main(String args[]) {
		Random r=new Random();
		for (int i = 0; i < 10; i++){
			int rand=r.nextInt();
			int abs=findAbssolute(rand);
			System.out.println("Absolute number of "+rand+" : "+abs);
		}
	}
}
