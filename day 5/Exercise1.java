/*Complete the assignment statement so that it computes the sum of all the numbers in the array. */


import java.util.*;
class Exercise1{
public static void main(String [] args){

   int [] val=new int[]{0,1,2,3,4};
   int sum=0;
   //Scanner sc=new Scanner(System.in);
   for (int i=0;i<val.length;i++)
   {
   sum=sum+val[i];
   }
   System.out.println("sum of all numbers="+sum);
   
}

}