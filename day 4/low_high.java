/*Write a program that asks the user for two integers, low and high and then sums all the integers
(inclusive) low through N.
Enter low:
5
Enter high:
10
Sum = 45
Do this by noticing that the sum from low to high is the same as the sum from one to high minus
the sum from one to (low-1). Calculate each of these by using the formula:
sum = (n*(n+1))/2
*/

import java.util.*;
class low_high{

public static void main(String args[]){

int low,high;
int sum=0;
Scanner sc=new Scanner(System.in);

System.out.println("Enter low number");
low=sc.nextInt();

System.out.println("Enter high number");
high=sc.nextInt();
int i = low;
 while(i<=high)
  {
        sum = sum+i;
         i=i+1;
         
    }
     System.out.println(sum);    
   }
   
   }