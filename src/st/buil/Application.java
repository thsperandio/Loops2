//StringBuilder are like string objects but can be modified
//Concatenating strings or adding then together, specially is a loop = use String Builder

package st.buil;

public class Application {

    public static void main(String[] args) {

        String example1 = "Hello! ";
        example1 += "My name is ";
        example1 += "David";
        System.out.println(example1);

        StringBuilder example2 = new StringBuilder(); // Create String builder

        example2.append("Hello! "); //Added Strings with the append method
        example2.append("My name is ");
        example2.append("Mike");

        String text = example2.toString(); //Get a String out of it using the toString method
        System.out.println(text);

        String name = "Tom ";
        StringBuilder example3 = new StringBuilder("Hello! "); //set to the original string
        example3.append("My name ").append("is ").append(name); //This is called Method chaining

        System.out.println(example3);

    }
}
