package com.campusdual;
import java.util.Scanner;
public class Exercise5 {


    //comprueba si un numero es positivo o negativo ---------------------------------------

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

    }

    //comprueba si un numero es multiplo de otro -------------------------------------------

    public static void multiple() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        if (number2 != 0 && number1 % number2 == 0) {
            System.out.println(number1 + " is a multiple of " + number2);
        } else {
            System.out.println(number1 + " is not a multiple of " + number2);
        }
    }

    //comprueba que un numero es menor que otro ------------------------------------------

    public static void minusthan(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        if (number1 < number2) {
            System.out.println(number1 + " is less than " + number2);
        } else {
            System.out.println(number1 + " is not less than " + number2);
        }

    }
}