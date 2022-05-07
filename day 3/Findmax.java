import java.util.*;
class Findmax
{
public static void main(String args[])

{
Scanner sc=new Scanner (System.in);
int x,y,z,max;
System.out.println("Enter 3 numbers ");
x=sc.nextInt();
y=sc.nextInt();
z=sc.nextInt();
if (x>y)

   {
   max=x;
   }   

else if (y>z)
  {
  max=y;
  }
else 
{
max=z;
}
System.out.println("max number is "+max);

}

}