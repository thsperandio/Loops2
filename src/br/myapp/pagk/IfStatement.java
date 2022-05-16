package br.myapp.pagk;

public class IfStatement {
    public static void main(String[] args) {

        int amout = 6;
        while(true){
            System.out.println("in the loop");

            if (amout == 6){
                break;
            }
            amout++;
            System.out.println("out of the loop");
        }

/*        if(amout ==10){
            System.out.println("True");
        }
        else if (amout < 30){
            System.out.println("False");
        }
        else {
            System.out.println("None");
        } */

        /*boolean comparison = 3<6;
        boolean notEqual = 3 != 4;
        boolean equals = 5==7;

        System.out.println(comparison);
        System.out.println(notEqual);
        System.out.println(equals); */

    }
}
