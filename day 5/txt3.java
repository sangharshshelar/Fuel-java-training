import java.util.*;
class txt3{
public static void main(String [] args){

   int n;
   Scanner sc=new Scanner(System.in);
   System.out.println("enter number ");
   n = sc.nextInt();
   int[] val = new int[10];
   // System.out.println("Number of arrays=");
   for(int i=1; i<n;i++)
   {
   val[i]=sc.nextInt();
   } 
   
   System.out.println("your arrays are ");
   
   for (int i=0;i<n;i++)
   
   {
   System.out.println(val[i]);
   }
}
}
//System.out.println("sum of all number is ="+ sum);