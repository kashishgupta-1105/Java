package JavaProblems;
import java.util.*;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int dup=n;
        int c = 0;
        int sum = 0;
        int res = n;

        while (n != 0) {
            c++;
            n = n / 10;
        }

        while (dup != 0) {
            int a = dup % 10;
            sum += Math.pow(a, c);
            dup = dup / 10;
        }
        System.out.println(c);
        System.out.println(sum);

        if(sum == res) {
            System.out.println(res + " is a Armstrong number");
        }
    }
}
