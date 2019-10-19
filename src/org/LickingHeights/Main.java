package org.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner keyboard;
        
        System.out.println("Hello World");
        keyboard = new Scanner (System.in);
        
        System.out.println("What's your name?");
        String greeting,name;
   
        name = " ";
        name = keyboard.nextLine();
        System.out.println( "Hello " + name);
        
        int a,b;
        a=10;
        b=15;
            int answer = multiply(a,b);
            System.out.println(answer);
            
            int c,d;
            e = 1;
            f = 5;
            double answer2 = divide(c,d);
                System.out.println(answer2);
        
        int e,f;
        e = 1;
        f = 2;
        int answer3 = theMax(e,f);
        System.out.println(answer3);
        
    }
    
    public static String theName(String name){
        return "Hello" + name;
    }
    
    public static int multiply (int a, int b){
        return a*b;
    }
    
    public static double divide (double c, double d){
        return c/d;
    }
    
    public static int theMax (int e,int f) {
        if (e > f) {
            return e;
    }
    
    
 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
}
