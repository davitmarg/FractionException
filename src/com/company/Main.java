package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1;
        int input2;
        int result;
        while (true) {
            try {
                input1 = Integer.parseInt(in.nextLine());
                input2 =  Integer.parseInt(in.nextLine());
                result = input1 / input2;
                break;
            } catch (NumberFormatException exception) {
                System.out.println("Invalid input format");
            } catch (ArithmeticException exception) {
                System.out.println("Divided by zero");
            }
        }
        System.out.println(result);
    }


}

