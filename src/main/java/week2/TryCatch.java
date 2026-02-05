package week2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryCatch {
    public static void read() {
        File file = new File("input1.txt");
        //Scanner sc = new Scanner(file);
        try {
            Scanner sc = new Scanner(file);
        } catch (FileNotFoundException  | IndexOutOfBoundsException exception) {
            System.out.println("File not found exception");
        }
    }
    static void main() {
        read();
    }
}
