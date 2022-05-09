/*Write a program that asks the user for N and then sum all the integers (inclusive) between 1 and
N.
Enter N:
10
Sum = 55
Do this in a loop that counts up 1 to N and in each iteration adds the current count to the sum.
Another way to calculate the same thing is through a formula:
sum = (n*(n+1))/2
*/

import java.util.*;
class int_sum{

public static void main(String args[]){

int a,b,sum,i;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Number");
       a= sc.nextInt();
       i=1;
       sum=0;
       while(i<=a)
       {
           sum=sum+i;
           i=i+1;
       }    
         System.out.println("Addition is:- "+sum);
     }
     
  }