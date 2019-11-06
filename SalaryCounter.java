import java.util.*;
class SalaryCounter{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input the number of employees: ");
		int n=input.nextInt();
		int salary;
		int sum=0;
		int i,x;
		for(i=1; i<=n; i++)
		{
			System.out.print("Input salary"+" "+i+" : ");
			x=input.nextInt();
			sum=sum+x;
		}	
		/*System.out.print("Enter your salary: ");
		int salary=input.nextInt();*/
		
		salary=sum;
	    int rs5000,rs2000,rs1000,rs500,rs100,rs50,rs20,rs10,rs5,rs2,rs1;
	    
	    rs5000=salary/5000;
	    salary=salary%5000;
	    
	    rs2000=salary/2000;
	    salary=salary%2000;
	    
	    rs1000=salary/1000;
	    salary=salary%1000;
	    
	    rs500=salary/500;
	    salary=salary%500;
	    
	    rs100=salary/100;
	    salary=salary%100;
	    
	    rs50=salary/50;
	    salary=salary%50;
	    
	    rs20=salary/20;
	    salary=salary%20;
	    
	    rs10=salary/10;
	    salary=salary%10;
	    
	    rs5=salary/5;
	    salary=salary%5;
	    
	    rs2=salary/2;
	    salary=salary%2;
	    
	    rs1=salary;
	    
	    System.out.println("Rs5000 notes : "+rs5000);
	    System.out.println("Rs2000 notes : "+rs2000);
	    System.out.println("Rs1000 notes : "+rs1000);
	    System.out.println("Rs500 notes : "+rs500);
	    System.out.println("Rs100 notes : "+rs100);
	    System.out.println("Rs50 notes : "+rs50);
	    System.out.println("Rs20 notes : "+rs20);
	    System.out.println("Rs10 notes : "+rs10);
	    System.out.println("Rs5 coins: "+rs5);
	    System.out.println("Rs2 coins: "+rs2);
	    System.out.println("Rs1 coins: "+rs1);
	    
	    
	}	
	
}
