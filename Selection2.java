import java.util.*;
class Selection2 {
	public static void sort(int[] x){
		for(int i=x.length; i>0; i--){
			int max=x[0];
			int index=0;
			for(int j=1; j<i; j++){
				if(x[j]>max){
					max=x[j];
					index=j;
				}
			}
			x[index]=x[i-1];
			x[i-1]=max;
		}
	}
	public static void main(String args[]) {
		int[] a={12,90,45,78,24,80,14,82,56,77,19,33};
		System.out.println(Arrays.toString(a));
		sort(a);
		System.out.println(Arrays.toString(a));
	}
}
