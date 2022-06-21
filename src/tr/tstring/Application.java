package tr.tstring;

class Employee{

    private int id;
    private String name;

    public Employee(int id, String name){ //Setting a constructor for the Employee

        this.id = id;
        this.name = name;
    }

    public String toString(){

        return("ID: " +  id + " - " + " Full Name: " + name);
    }
}

public class Application {

    public static void main(String[] args) {

        Employee employee1 = new Employee(101, "Harper Smith");
        Employee employee2 = new Employee(201, "Pederneiras");

        System.out.println(employee1);
        System.out.println(employee2);

    }
}
