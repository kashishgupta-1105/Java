package JavaProblemsweek1;
import java.util.Scanner;

//In a program, input the side of a square. You have to output the area of the square
public class SquareOfANumber {
    public static void main(String[] ards) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of Square: ");
        int side = sc.nextInt();
        System.out.println("Area of square is = ");
        int area = side*side;
        System.out.println(area);
    }
}
