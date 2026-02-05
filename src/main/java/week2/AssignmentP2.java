package week2;

import java.util.Scanner;

//User defined exception
class AgeNotValidException extends RuntimeException {
    public AgeNotValidException(String msg) {
        super(msg);
    }
}
public class AssignmentP2 {
    static void validateAge(int age) {
        if(age < 18)
            throw  new AgeNotValidException("Age must be greater than 18");

        System.out.println("Access Granted");

    }
    public static void main(String[] args){
        System.out.print("Enter the age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try {
            validateAge(age);
        } catch (AgeNotValidException e) {
            System.out.println(e.getMessage());
        }
    }

}
// The user defined exception here is treated as runtime exception as it is a business logic error. Compiler will
// not force you to handle it.