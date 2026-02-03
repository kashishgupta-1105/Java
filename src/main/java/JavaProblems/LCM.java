package JavaProblems;

import java.util.Scanner;

public class LCM {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter Second number: ");
        int n2 = sc.nextInt();
        int i = 1;
        int greater = (n1>n2)?n1:n2;
        while(true) {
            if ((greater * i) % n1 == 0 && (greater * i) % n2 == 0) {
                System.out.println("The LCM is " + greater);
                break;
            }
            i++;
        }
    }
}
