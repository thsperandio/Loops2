//Static method cannot access instance variables
//Static data exist before making any object of the class so it doesn't know about the values given to the instance variables

package br.myapp.pagk;

class Student{

    public String name; //non static variables are instance variables
    public static String studentClass; //static variables belong to a class and exists in only one copy of the variable

    public void studentName() {
        // System.out.println(name);
        System.out.println(name + " is enrolled:  " + studentClass); //non static methods can access non static data
    }

    public static void classInfo() { //Accessed via class
         System.out.println("Java");
       // System.out.println(name); This gives an error
    }

    //Use of static field below//
    public static final int MY_CONSTANT = 8; //final makes so tou can't change that constant. Can be any java type like double, int, byte etc

    public static int count = 0; // To count he number of objects created
    public Student () {
        count++; //Count is static field and belongs to the class. There's only one copy of "count" and it will be shared through all the objects
    }
}

public class StaticandFinal {

    public static void main(String[] args) {

        Student.studentClass = "Web Development Fundamentals";
        System.out.println(Student.studentClass);

        System.out.println("Before creating objects: " + Student.count);

        Student student1 = new Student();
        Student student2 = new Student();

        System.out.println("After creating objects: " + Student.count);

        student1.name = "Steven";
        student2.name = "Daniel";

        //System.out.println(student1.name);
        //System.out.println(student2.name);

        student1.studentName(); //The results are the name from the above
        student2.studentName(); //Calling these Methods to output the name of the students

        Student.classInfo(); //Accessed the data od classInfo by calling the class Student

        System.out.println(Math.E);
        System.out.println(Student.MY_CONSTANT);

    }
}
