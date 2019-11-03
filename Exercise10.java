import java.util.*;
class Exercise10 {
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        //System.out.print("Input no of students : ");
        //final int N=input.nextInt();
        int N;
        int total=0;
        for (int i = 0; i < N && i !=-1; i++) {
            System.out.print("Input marks for student "+(i+1)+" : ");
            int marks=input.nextInt();
            total+=marks;
        }
        //double avg=(double)total/N;
       // System.out.println("Total marks : "+total);
     //   System.out.println("Average marks : "+avg);
    }
}
