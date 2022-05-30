package co.interfaces;

public class Computer implements Information { // "Implements" forces us to implement each abstract Method that is in our Interface

    private int serialNumber = 8035;

    public void start (){

        System.out.println("Computer Started");
    }

  //  @Override - Just to male sure that this Method is overridden from the Information interface
    public void displayInformation() {

        System.out.println("Computer Serial Number is " + serialNumber);

    }
}
