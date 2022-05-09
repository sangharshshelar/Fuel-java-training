/*7. Write a program to implement a class “student” with the following members. Name of the
student. Marks of the student obtained in three subjects. Function to assign initial values.
Function to compute total average. Function to display the student’s name and the total marks.
Write an appropriate main() function to demonstrate the functioning of the above.*/

import java.util.*;
class Student {
    String name;
    int marks[];

    void setValues(String n, int val[]){
        name = n;
        marks = new int[3];
        for(int i = 0; i < 3; i++){
            marks[i] = val[i];
        }
    }

    double totalAverage(){
        double ans = 0.0;
        for(int i = 0; i < 3; i++){
            ans += marks[i];
        }
        ans = ans / 3.0 ;
        return ans;
    }

    void display(){
        int total = 0;
        for(int i = 0; i < 3; i++)
            total += marks[i];

        System.out.println("Name: " + name);
        System.out.println("Total marks: " + total);
    }

    public static void main(String args[]){
        int val[] = {90, 80, 85};
        Student s = new Student();
        s.setValues("Subj", val);

        s.display();
        System.out.println("The average marks is: " + s.totalAverage());
    }
}