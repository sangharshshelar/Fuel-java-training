import java.util.*;
class swapNum
{
public static void main(String args[])

{

// Swapping Logic:  
int a,b ;

Scanner sc=new  Scanner(System.in);
System.out.println("Enter 2 number ");

a = sc.nextInt();
b = sc.nextInt();
System.out.println("a "+a+ " b "+b);


int temporary = a;
 a = b;
 b = temporary;
 
 
 System.out.println("After swap");
 System.out.println("First number = " + a);
 System.out.println("Second number = " + b);


}


}


