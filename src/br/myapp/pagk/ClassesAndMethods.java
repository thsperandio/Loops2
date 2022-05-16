package br.myapp.pagk;

class Methods {

    String animal;
    int value;
    void run(){
        for (int i = 0; i<6; i++){
            System.out.println("My " + animal + " is " + value + "years old");
        }
    }
}

public class ClassesAndMethods {

    public static void main(String[] args) {

        Methods name = new Methods();
        name.animal = "Dog";
        name.value = 8;
        name.run();


    }
}
