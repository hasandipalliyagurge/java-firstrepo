import java.util.*;
class Sort{
	public static void Sort(int[] x){
		/*if(x[0]>x[1]){
			int t=x[0];
			x[0]=x[1];
			x[1]=t;
		}
		if(x[1]>x[2]){
			int t=x[1];
			x[1]=x[2];
			x[2]=t;
		}*/
		for (int j = 0; j < x.length-1; j++){
			for (int i = 0; i < x.length-1; i++){
				if(x[i]>x[i+1]){
				int t=x[i];
				x[i]=x[i+1];
				x[i+1]=t;
			}
		}
	}
		
}
	public static void main(String args[]) {
		int[] a={12,90,45,78,24,80,14,82,56,77,19,33};
		System.out.println(Arrays.toString(a));
		Sort(a);
		System.out.println(Arrays.toString(a));
	}
	}

