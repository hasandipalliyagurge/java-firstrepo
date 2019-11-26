import java.util.*;
class Switch1 {
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        System.out.print("Input an integer : ");
        int num=input.nextInt();
		/*if(num==1){
			System.out.println("Number 1 ");
		}else if(num==2){
			System.out.println("Number 2 ");
		}else if(num==3){
			System.out.println("Number 3 ");
		}else if(num==4){
			System.out.println("Number 4 ");
		}else{
			System.out.println("Wrong Number");
		}*/
		switch(num){
			case 1	:	System.out.println("Number 1");
						break;
			case 2	:	System.out.println("Number 2");break;
			case 3	:	System.out.println("Number 3");break;
			case 4	:	System.out.println("Number 4");break;
			default	:	System.out.println("Wrong Number"); //break is optional
		}
    }
}
