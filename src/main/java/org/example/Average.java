package org.example;
import java.util.*;

public class Average {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number: ");
        int a = sc.nextInt();
        System.out.println("Enter second Number: ");
        int b = sc.nextInt();
        System.out.println("Enter third Number: ");
        int c = sc.nextInt();
        System.out.println("Average of the above three numbers = ");
        System.out.println((a+b+c)/3);
    }
}
