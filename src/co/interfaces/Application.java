package co.interfaces;

public class Application {

    public static void main(String[] args) {

        Computer computer1 = new Computer();
        computer1 .start();

        Vehicle vehicle1 = new Vehicle("Car"); //Has a defined type in the Vehicle Class - String
        vehicle1.drive();

        Information info = new Computer(); //Because Computer implements Information
        info.displayInformation(); //called the Method defined in the interface

        Information info1 = vehicle1;
        //vehicle1 is a variable that points to an object which is of Vehicle Class and Vehicle Class implements Information interface
        info1.displayInformation();

        System.out.println();
        showInformation(computer1);
        showInformation(vehicle1);
    }

    private static void showInformation(Information info){

        info.displayInformation();
    }
}
