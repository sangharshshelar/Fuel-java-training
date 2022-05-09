import java.util.*;
class in_line {

    public static void main(String args[]) {
        System.out.println("Please enter your words");
        Scanner sc = new Scanner(System.in);


        String word = sc.next();

        for(char a : word.toCharArray())
        {
            System.out.println(a);
        }

    }

}