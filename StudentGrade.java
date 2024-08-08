import java.util.Scanner;
public class StudentGrade{
  public static void main (String args[]){
    int a,b,c,d,e,sum,grd,avg;
    System.out.println("enter markes of five subjects ");
    Scanner sc= new Scanner(System.in);
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    d=sc.nextInt();
    e=sc.nextInt();

    sum=a+b+c+d+e;
    System.out.println("total marks"+sum);

    avg=sum/5;
    System.out.println("average the total numbers"+avg);
     
    grd=avg;

    if(grd<50)
        System.out.println("grade D");
     else if(grd<60)   
        System.out.println("grade C");
     else if(grd>70)   
        System.out.println("grade B");
      else if(grd<80)  
        System.out.println("grade A");
      else if(grd<90)  
        System.out.println("grade O");
      else 
        System.out.println("grade is very bad");

   System.out.println("Total marks is "+sum+" Average marks "+avg+" Grade of marks "+grd); 
  }
}
