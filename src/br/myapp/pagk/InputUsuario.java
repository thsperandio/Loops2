package br.myapp.pagk;

import java.util.Scanner;

public class InputUsuario {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        double number = input.nextDouble();
        System.out.println("Your number is: " + number);

        /* Scanner input = new Scanner(System.in);
        System.out.println("Enter a Integer: ");
        int aVlaue = input.nextInt();
        System.out.println("Your number is: " + aVlaue); */

      /*  Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String text = input.nextLine();
        System.out.println("Your line is: " + text); */
    }
}
