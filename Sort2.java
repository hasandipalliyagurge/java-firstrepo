import java.util.*;
class Sort2 {
	public static void sort(int[] x){
		for(int j=x.length-1; j>0; j--){
			for(int i=0; i<j; i++){
				if(x[i]>x[i+1]){
					int t=x[i];
					x[i]=x[i+1];
					x[i+1]=t;
				}
				System.out.println(Arrays.toString(x));	
				try{Thread.sleep(500);}catch(Exception ex){}
			}
		}
	}
	public static void main(String args[]) {
		int[] a={90,80,70,60,50,40,30,20,10,0};
		System.out.println(Arrays.toString(a));
		sort(a);
		System.out.println(Arrays.toString(a));
	}
}
