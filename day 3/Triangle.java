import java.util.*;
class Triangle
{
public static void main(String args[])
{
int angle1,angle2,angle3,total;
Scanner sc=new Scanner(System.in);
angle1 = sc.nextInt();
angle2 = sc.nextInt();
angle3 = sc.nextInt();
total = angle1 + angle2 + angle3;
if (angle1+angle2+angle3==180)
{
System.out.println("Traingle is valid ");
}

else 
{
System.out.println("Traingle is Not valid ");
}

}

}