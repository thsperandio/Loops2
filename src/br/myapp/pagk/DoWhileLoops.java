package br.myapp.pagk;

import java.util.Scanner;

public class DoWhileLoops {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = 0;

        do {
            System.out.println("Enter a number: ");
            number = input.nextInt();

        }
        while (number != 9);
        System.out.println("you got 9");
    }
}
