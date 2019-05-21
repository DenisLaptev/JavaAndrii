package com.javaproject.firstproject.examples;

import java.util.Scanner;

public class QuarticEquation {

//a*x^2+b*x+c=0
//D = b^2 -4*a*c

    //x1=(-b+sqrt(D))/(2*a)
//x2=(-b-sqrt(D))/(2*a)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = 1;
        double b = 1;
        double c = 1;
        double D = 0.0;
        double x1 = 1;
        double x2 = 1;


        boolean isCorrectParameters = false;
        while (isCorrectParameters == false) {
            System.out.println("Enter a:");
            a = scanner.nextDouble();

            System.out.println("Enter b:");
            b = scanner.nextDouble();

            System.out.println("Enter c:");
            c = scanner.nextDouble();

            System.out.println("a=" + a);
            System.out.println("b=" + b);
            System.out.println("c=" + c);

            D = b * b - 4 * a * c;
            if (D >= 0) {
                isCorrectParameters = true;
            }else{
                System.out.println("D=" + D);
                System.out.println("wrong parameters!");
                System.out.println("TRY AGAIN!");
            }
        }
        if (D < 0) {
            System.out.println("D=" + D);
            System.out.println("wrong parameters!");

        } else if (D == 0) {
            System.out.println("D=" + D);
            x1 = -b / (2 * a);
            System.out.println("Equation has 1 solution: x1=" + x1);

        } else {
            System.out.println("D=" + D);
            x1 = (-b + Math.sqrt(D)) / (2 * a);
            x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Equation has 2 solutions");
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
        }

    }
}
