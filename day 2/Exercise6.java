/*Rainfall for April: 12
Rainfall for May : 14
Rainfall for June: 8
Average rainfall: 11.333333*/

import java.util.*;
class Exercise6
{
public static void main(String args[])
{
int April,May,June,total;
double average;

Scanner sc=new Scanner(System.in);
System.out.println("Enter the rainfall:");

April = sc.nextInt();
May = sc.nextInt();
June = sc.nextInt();
total = (April+May+June);
average = total/3;
 
 System.out.println("Rainfall for April:" + April);
 System.out.println("Rainfall for May :" + May );
 System.out.println("Rainfall for June:" + June );
 System.out.println("average rainfall is :" +average );
 

 
 }
 
 }