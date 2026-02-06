package week2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MultipleExceptions {
    public static void read() {
        File file = new File("eg.txt");
        Scanner sc;

        {
            try {
                sc = new Scanner(file);
            } catch (FileNotFoundException e) {
                System.out.println("File not found exception");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    static void main() {
        read();
    }
}
