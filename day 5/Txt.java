import java.util.*;
class Txt{
public static void main(String [] args){

   int [] val=new int[]{12,14,13,17,20,22};
   int sum=0;
   //Scanner sc=new Scanner(System.in);
   for (int i=0;i<val.length;i++)
   {
   sum=sum+val[i];
   }
   System.out.println("sum of all numbers="+sum);
   
}

}