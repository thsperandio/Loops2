package br.myapp.pagk;

class Retornar {

    String animal;
    int value;
    int months;

    void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println("My " + animal + " is " + value + "years old");
        }
    }

    int calcDayToBirthday() {               //to use the value in other methods
        int monthToBday = 12 - months;
        return monthToBday;
    }

    //Passing values to Methods

    void talk(String text) { //Can use int, double or whatever type that was given in name.talk down below
        System.out.println(text);
    }

    void walk(int speed) {
        System.out.println("Walking " + speed + "km/h");
    }

    void timer(int minutes, double seconds) {
        System.out.println("It took " + minutes + " minutes and " + seconds + " seconds to get down the Hill");
    }
}

public class Retornos {

    public static void main(String[] args) {

        Retornar name = new Retornar();

        name.animal = "Dog";
        name.value = 9;
        name.run();
        name.months = 7;
        int month = name.calcDayToBirthday(); //return has allowed to use this over here, can be used as double, int, byte etc
        System.out.println("Month until Birthday: " + month);

        name.talk("Hi I'm Thiago");
        name.walk(78);
        name.timer(9, 3.67);

        String hello = "Hello There"; //If u pass this new variable created to the methods it'll work just fine, can use variables with different  names to call it
        name.talk(hello);

    }
}
