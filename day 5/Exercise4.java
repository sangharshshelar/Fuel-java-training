/*Exercise 4 — Same Sum
Complete the program with four assignment statements that put values into valB so that the sum
of corresponding cells in valA and valB is 25. */

import java.util.*;
class Exercise4
{
 public static void main ( String[] args)
 {
     int[] valA = { 13, -22, 82, 17};
     int[] valB = { 0, 0, 0, 0};

  System.out.println( "valA: " + valA[0] + " " + valA[1] + " " + valA[2] + " " + valA[3] );

 System.out.println( "valB: " + valB[0] + " " + valB[1] + " " + valB[2] + " " + valB[3] );

 System.out.println( "sum: " + (valA[0]+valB[0]) + " " + (valA[1]+valB[1]) + " "

                          + (valA[2]+valB[2]) + " " + (valA[3]+valB[3]) );
 
 }

}