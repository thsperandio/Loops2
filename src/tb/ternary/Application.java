package tb.ternary;

public class Application {

    public static void main(String[] args) {

        System.out.println(true ? "false" : "false");

        int number = 18;
        number = number > 20 ? number: 20;
        System.out.println(number);

        //Can be used to find the maximum and minimum values in a array

        int[] numbers = {5, 43, 75, 57, 84};
        int lowestNumber = Integer.MAX_VALUE;
        for (int currentNumber: numbers){

            lowestNumber = currentNumber < lowestNumber ? currentNumber :lowestNumber;
        }

        System.out.println(lowestNumber);

    }
}
