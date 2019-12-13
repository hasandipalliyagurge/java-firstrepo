import java.util.*;
class Selection {
	public static void sort(int[] x){
		for (int i =x.length; i>0 ; i--){
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
		/*
		int max=x[0];
		int index=0;
		for(int j=1; j<x.length; j++){
			if(x[j]>max){
				max=x[j];
				index=j;
			}
		}
		x[index]=x[x.length-1];
		x[x.length-1]=max;
		//-------------------------------------
		max=x[0];
		index=0;
		for(int j=0; j<x.length-1; j++){
			if(x[j]>max){
				max=x[j];
				index=j;
			}
		}
		x[index]=x[x.length-2];
		x[x.length-2]=max;
		//-------------------------------------------
		max=x[0];
		index=0;
		for(int j=0; j<x.length-2; j++){
			if(x[j]>max){
				max=x[j];
				index=j;
			}
		}
		x[index]=x[x.length-3];
		x[x.length-3]=max;
		* */
	}
	public static void main(String args[]) {
		int[] a={12,90,45,78,24,80,14,82,56,77,19,33};
		System.out.println(Arrays.toString(a));
		sort(a);
		System.out.println(Arrays.toString(a));
	}
}
