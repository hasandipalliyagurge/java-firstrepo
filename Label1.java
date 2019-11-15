import java.util.*;
class Label1 {
    public static void main(String args[]) {
		L1: for (int i = 0; i < 10; i++){
			L2: for(int j=0; j<10; j++){
				System.out.println(i+" : "+j);
				if(j==5){break L1;}
			}
		}
    }
}
