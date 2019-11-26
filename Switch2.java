import java.util.*;
class Switch2 {
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        System.out.print("Input month number : ");
        int month=input.nextInt(); 
		//month==1,3,5,7,8,10,12 -->31days
		//month==4,6,9,11 -->30days
		//month==2 -->30daysx
		switch(month){
			case 1: 
			case 3:
			case 5: 
			case 7: 
			case 8: 
			case 10: 
			case 12: System.out.println("31 days");break;
			case 4: 
			case 6:
			case 9: 
			case 11: System.out.println("30 days");break;
			case 2: System.out.println("28 days");break;
			default:System.out.println("In-valid");
		}
		
		
		//System.out.println("31 days");
		//System.out.println("30 days");
		//System.out.println("28 days");
			
    }
}
