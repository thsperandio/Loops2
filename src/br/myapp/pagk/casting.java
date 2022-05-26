//Casting - Store a numerical value and store it in another type of numerical value

package br.myapp.pagk;

public class casting {

    public static void main(String[] args) {

        byte byteValue = 3;
        short shortValue = 38;
        int intValue = 29;
        long longValue = 3456;

        float floatValue = 569.34f;
        double doubleValue = 345.34;

        System.out.println(Byte.MAX_VALUE);

        intValue = (int) longValue;
        System.out.println(intValue);

        intValue = (int) floatValue;
        System.out.println(intValue);//loses everything after decimal point

        //Casting is only needed when you want to assign values that has a bigger memory to values that has a smaller memory


    }
}
