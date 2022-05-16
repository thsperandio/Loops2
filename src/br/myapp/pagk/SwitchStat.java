package br.myapp.pagk;

import java.util.Scanner;

public class SwitchStat {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //char byte short int string ---- supported only
        System.out.println("Qual o seu time?: ");
        String text = input.nextLine();

        switch (text){
            case "Grêmio":
                System.out.println("Está na Série B");
                break;
           /* case "stop":
                System.out.println("Program is Stropped");
                break; */
            default:
                System.out.println("Não está na Série B");
        }
    }
}
