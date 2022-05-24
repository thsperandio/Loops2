//Polymorphism means is that if you have a sub Class of a supper Class you can use sub class where you would use a supper class
//What matters when a Method is called in Polymorphism is not the type of the reference --
//--It's the object which the reference is pointing at
//When you call the Method it is the actual type of the Method which decides which Method you can call--
//--But when you actually call the Method is the object of the reference that decided which Method is gonna be called
package uk.vehicle.ok;

public class Applic {
    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle();
        Car car = new Car();

        Vehicle vehicle2 = vehicle1; //two references pointing to the same object --Reference is vehicle, Object is Car
        //Vehicle vehicle2 = car; //Since car is a sub Class of Vehicle this can be used

        vehicle2.design(); //Because this Vehicle is pointing to a Car Object therefore it uses the Method in the Car Class

        car.ride();

        createDesign(car);// Polymorphism garantees that when a supper Class is expected a sub Class can be called instead
        }

        public static void createDesign(Vehicle vehicle){

        vehicle.design();
        }
    }

