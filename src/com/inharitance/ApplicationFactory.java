package com.inharitance;

public class ApplicationFactory {

    public static void main(String[] args) {

        Factory factory1 = new Factory(); //Object created

        factory1.design(); //Method called
        factory1.build(); //Method called

        Car car1 = new Car();

        car1.design();
        car1.build();
        car1.brand(); //Is only on Car Class that is an extention of Factory
        //We have Methods in Car class that we dont have in Factory
        //This is useful when you don't have a source code of a Class we can extend an existing a Class and add your own code
        //Final Classes can't be extended

        //Access Modifiers: public, protected, default(lack of access modifier), private

        //public = Can access the Methods from any class, regardless the package
        //protected = Can be accesses from the this class, other classes from the same package, but if the class is a different package from--
        //--we are trying to access this Method that Class has to extend the Class that this methods is in it
        //Only subclasses from different packages can access protected methods

        //default: can call this Method only from the same Class or the Classes that and in the same Package

        //private: Can call a Method only within the same class, not even in subclasses.


    }
}
