package br.myapp.pagk;

public class MultiArray {
    public static void main(String[] args) {

        int[][] multiDimensionalArray = {{23, 56, 67},{34, 56, 90, 678}, {34, 67, 2345}};
        System.out.println(multiDimensionalArray[1][3]);//first [] is the array and the second [] is the item in that array
        System.out.println(multiDimensionalArray[0][2]);

        double[][] doubleArray = new double[4][3]; // Second [] can be omitted to specify later on
        doubleArray[3][2] = 12;
        System.out.println(doubleArray[3][2]);

        for (int array = 0; array<multiDimensionalArray.length;array++){
            for (int item = 0; item<multiDimensionalArray[array].length; item++){ //[] the length of the array you want
                System.out.print(multiDimensionalArray[array][item] + "\t");;
            }
            System.out.println(); //makes each array be printed in another line
        }



    }
}