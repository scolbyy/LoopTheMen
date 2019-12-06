package com.company;

public class Factorial {

    public static long calcFactorial(int a){
        long total=1;
        while (a>0){
            total = total*a;
            a--;
        }
        return total;
    }
    public static void calcE(){
        int e = 1;
        int olde = 0;
        while (e-olde > 0.001){
            
        }
    }

    public static void main (String [] args){
        for (int i=1; i<=20; i++){
            System.out.print(calcFactorial(i));
            System.out.println();
        }
    }
}
