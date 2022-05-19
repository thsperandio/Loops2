//Construtors are a special method which is run when you create an instance of a class
//Constructos can initiate instance variables
//Constructors can have parameters
// 1 - call to the second constructor. Java will look at the parameters and mesh the constructors, if an int value is added jave will look for a constructor that has an int variable
package br.myapp.pagk;

class Program{

    int value;
    String text;
    public Program(){ //The name must be the same of the class, Constructor does not nave a return type, Method have return type
        this(5); // it calls the second constructor within the first one. IT HAS TO BE THE FIRST LINE
        System.out.println("First constructor");
        value = 12;
    }

    public  Program(int value){ //local variables mask the instance variables
        this.value = value; // this.value is the instance variable above
        System.out.println("Second constructor");
    }

    public Program(int value, String text){
        this(); //without anything inside parenthesis it calls the first constructor
        this.value = value;
        this.text = text;
        System.out.println("Third Constructor");

    }


}

public class Constructor {
    public static void main(String[] args) {

        Program myProgram = new Program(); //new Program(); makes the constructor run
        Program myProgram1 = new Program(2); // 1 - check above
        Program myProgram2 = new Program(3, "Hi");


    }
}
