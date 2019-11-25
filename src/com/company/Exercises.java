package com.company;

public class Exercises {
    public static int addOdds(int n){
        int total =0;
        for (int i =1; i<=n; i=i+2){
            total = total+i;
        }
        return total;
    }
    public static int howManyYears (double startPop, double endPop){
        int a=0;
        while (startPop <= endPop){
            startPop = startPop +(startPop*0.0113);
            a++;
        }
        return a;
    }
    public static void main (String [] args){
        System.out.println(addOdds(9));
        System.out.println(howManyYears(111.2, 120));
    }

}
