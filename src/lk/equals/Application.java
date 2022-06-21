package lk.equals;

import java.util.Objects;

class Laptop{

    private int id;
    private String brand;

    public Laptop(int id, String brand) {
        this.id = id;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Laptop{" + "id=" + id + ", brand='" + brand + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return id == laptop.id && brand.equals(laptop.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand);
    }
}

public class Application {

    public static void main(String[] args) {


        Laptop laptop1 = new Laptop(250, "HP");
        Laptop laptop2 = new Laptop(90, "Dell");
        //System.out.println(laptop1 == laptop2);//== tells you whether two references to objects are pointing  at the same object or not
        System.out.println(laptop1.equals(laptop2));

        int firstNumber = 8;
        int secondNumber = 8;

        System.out.println(firstNumber == secondNumber); // pointing at the same object

        String a = "yes";
        String b = "yes";

        System.out.println(a == b); //only use == to check of two things, two references are pointing at the same object. Always use .equals to compare Strings

    }
}
