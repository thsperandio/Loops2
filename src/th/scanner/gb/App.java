package th.scanner.gb;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class App {

    public static void main(String[] args) throws FileNotFoundException {

        String myFile = "C:\\Users\\thiag\\OneDrive\\Documentos\\Teste.txt"; //It is possible to just drag and drop the file here

        File file = new File(myFile);

        Scanner text = new Scanner(file);

        int value = text.nextInt(); //To read the integer 9 on the top of the file
        System.out.println("Value is: " + value);

        while (text.hasNextLine()) {
            String line = text.nextLine();
            System.out.println(line);
        }

        text.close();//This closes the scanner class

    }
}
