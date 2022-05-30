package co.interfaces;

public class Vehicle implements Information {

    private String type;
    public Vehicle(String type) {
        this.type = type;
    }
    public void drive(){

        System.out.println("Driving the Vehicle");
    }
    @Override // Override is optional
    public void displayInformation() {
        System.out.println("Vehicle type is: " + type);

    }
}

/*Interface is a kind of textual contract where you have an interface with any number of Methods with different parameters--
--different return types. When "implements" in the class you actually have to implement every Methods.
    It's possible to implement any number of interfaces, but only extend one Class, example:

    public class Vehicle extends Computer implements Information, Java, Place{ ---- alwya separated with a comma.



 */