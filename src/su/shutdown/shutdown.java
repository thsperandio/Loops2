//Anonymous Classes are a way of either extending a class or implementing an interface in such a way you can do a one time thing
//Cannot create a new object of that Class
package su.shutdown;

class Computer{
    public void shutdown(){
        System.out.println("The Computer is shutting down");
    }
}

interface Phone{
    public void call(); //Method in interface does not use {}

}

public class shutdown {

    public static void main(String[] args) {

        Computer computer1 = new Computer(){ //within the curly braces you can override the Method in computer Class
            @Override
            public void shutdown(){
                System.out.println("MacBook is shutting Down");
            }
        };
        computer1.shutdown();

        Phone phone1 = new Phone() { //Can't create an object from an Interface
            @Override
            public void call() {
                System.out.println("Calling...");
            }
        };
        phone1.call();
    }
}
