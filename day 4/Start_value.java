/*Write a program that asks the user for a starting value and an ending value and then writes all the
integers (inclusive) between those two values.
Enter Start:
5
Enter End:
9*/

import java.util.*;
class Start_value{

public static void main(String args[]){

int start,end,i;
Scanner sc=new Scanner(System.in);

System.out.println("Enter start vlaue");
start=sc.nextInt();

System.out.println("Enter end vlaue");
end=sc.nextInt();
i = start;
while(i <= end)
{
System.out.println(i);
i=i+1;
}

}
}