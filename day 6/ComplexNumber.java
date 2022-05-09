/*5. Design a class 舛omplex 層ith data members for real and imaginary part. Provide default and
Parameterized constructors. Write a program to perform arithmetic operations of two complex
numbers.*/

import java.util.*;
class ComplexNumber{


    private double real;
    private double imaginary;

    public ComplexNumber(double r, double i){
        setReal(r);
        setImaginary(i);
    }

    public ComplexNumber(){
        setReal(0);
        setImaginary(0);
    }

    public double getReal(){
        return real;
    }

    public double getImaginary(){
        return imaginary;
    }

    public void setReal(double r){
        real = r;
    }

    public void setImaginary(double i){
        imaginary = i;
    }

    public void add(ComplexNumber c){
        real += c.getReal;
        imaginary += c.getImaginary;
    }

    public void subtract(ComplexNumber c){
         real -= c.getReal;
         imaginary -= c.getReal;
    }

    public String toString(){
         return "(" + real + ", " + imaginary + ")";
    }

}