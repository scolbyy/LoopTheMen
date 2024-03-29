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
    public static int sumDigits(int n){
        int total=0;
        int d=0;
        while (n>0){
            d = n%10;
            n = n/10;
            total = total + d;
        }
        return total;
    }
    public static void sillyNumbers(){
        for (int n=1; n<=3; n++) {
            for (int i = 0; i <= 9; i++) {
                int a = 1;
                while (a <= 3) {
                    System.out.print(i);
                    a++;
                }
            }
            System.out.println();
        }
    }
    public static void sillyNumbers2(){
        for (int i=1; i<=4; i++){
            for (int a=9; a>=1; a--){
                for (int n=1; n<=a; n++){
                    System.out.print(a);
                }
            }
            System.out.println();
        }
    }

    public static void dollarsAndStars() {
        int b = 0;
        int e = 0;
        int g = 0;
        int j = 0;
        int l = 0;
        for (int a = 1; a <= 7; a++) {
            for (int c = 0; c < b; c++) {
                System.out.print("*");
            }
            b = b + 2;
            for (int d=7; d>e; d--){
                System.out.print("$");
            }
            e = e + 1;
            for (int f=14; f>g; f--){
                System.out.print("*");
            }
            g = g + 2;
            for (int h=7; h>j; h--){
                System.out.print("$");
            }
            j = j + 1;
            for (int k = 0; k < l; k++) {
                System.out.print("*");
            }
            l = l + 2;
            System.out.println();
        }
    }

    public static void main (String [] args){
        System.out.println(addOdds(9));
        System.out.println(addOdds(10));
        System.out.println(addOdds(25));
        System.out.println(howManyYears(111.2, 120));
        System.out.println(howManyYears(111.2, 150));
        System.out.println(sumDigits(420));
        System.out.println(sumDigits(69));
        System.out.println(sumDigits(99999969));
        sillyNumbers();
        sillyNumbers2();
        dollarsAndStars();
    }

}
