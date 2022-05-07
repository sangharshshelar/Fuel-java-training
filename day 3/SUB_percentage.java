import java.util.*;
class SUB_percentage
{
public static void main(String args[])
{
int Physics,Chemistry,Biology,Mathematics,Computer,total;
Scanner sc=new Scanner(System.in);
System.out.println("Enter subjects marks");
Physics = sc.nextInt();
Chemistry = sc.nextInt();
Biology = sc.nextInt();
Mathematics = sc.nextInt();
Computer = sc.nextInt();
total = (Physics+Chemistry+Biology+Mathematics+Computer)/5;

System.out.println("Avrage is : " +total);
if (total>90)
{
System.out.println("Grade A");
}
else if (total>80)
{
System.out.println("Grade B");
}
else if (total>70)
{
System.out.println("Grade C");
}
else if (total>60)
{
System.out.println("Grade D");
}
else if (total>50)
{
System.out.println("Grade E");
}

}


}