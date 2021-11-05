package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Rechnung {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("a=");
            int a = in.nextInt();
            System.out.println("b=");
            int b = in.nextInt();
            checkIfNegative(a);
            checkIfNegative(b);
            System.out.println("a/b=" + (a / b));

        } catch(ArithmeticException exception) {
            System.out.println("Division durch Null nicht erlaubt!");
        } catch(InputMismatchException inputException) {
            System.out.println("Buchstaben nicht erlaubt");
        } catch(NegativeNumberException negativeNumberException) {

        }
    }

    public static void checkIfNegative(int number) {
        if(number < 0) {
            throw new NegativeNumberException();
        }
    }
}
