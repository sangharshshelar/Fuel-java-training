/*Exercise 5 — Reverse Order
Complete the program so that the numbers in the array appear in reversed order. You will need to
use the variable temp to do this.
Note: this is a harder exercise than you might guess. I sometimes put it on a midterm
examination, and some students get the question wrong.*/

import java.util.*;
class Exercise5
{
 public static void main ( String[] args )
 {
 int[] val = {0, 1, 2, 3};
 int temp;
 System.out.println( "Original Array: "+ val[0] + " " + val[1] + " " + val[2] + " " + val[3] );

 System.out.println( "Reversed Array: " + val[3] + " " + val[2] + " " + val[1] + " " + val[0] );

 }
}