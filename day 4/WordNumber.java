import java.util.*;
class WordNumber{

  public static void main(String args [])  {
   System.out.println("Enter word");
   Scanner input=new Scanner(System.in);
   String World=input.next();
   int len=World.length();
   System.out.println();
    for(int i=0;i<len;i++)
    {
          System.out.println(World);
    }
  
  }
}