import java.util.*;
class ArrayDemo{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int[] arr=new int[5];
int i;
System.out.println("enetr array");
for(i=0;i<arr.length;i=i+1)
{
arr[i]=sc.nextInt();
}
System.out.println("your array");
for(i=0;i<arr.length;i=i+1)
{
System.out.println(arr[i]);
}

}
}