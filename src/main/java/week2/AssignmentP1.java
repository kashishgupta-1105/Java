package week2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AssignmentP1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Enter the first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = sc.nextInt();
            int res = num1 / num2;
        }catch (ArithmeticException e){
            System.out.println("Division by zero is not allowed.");
        }catch(InputMismatchException i){
            System.out.println("Integer Input is required.");
        }finally {
            System.out.println("Program Execution completed");
        }
    }
}
