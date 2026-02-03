package JavaProblems;
import java.util.*;

public class CalculateTax {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();

        // Accept tax regime choice
        System.out.println("Choose Tax Regime:");
        System.out.println("1. Old Tax Regime");
        System.out.println("2. New Tax Regime");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = sc.nextInt();

        double tax = 0;

        switch (choice) {
            case 1: // Old Tax Regime
                if (salary <= 250000) {
                    tax = 0;
                } else if (salary <= 500000) {
                    tax = (salary - 250000) * 0.05;
                } else if (salary <= 1000000) {
                    tax = (500000 - 250000) * 0.05 + (salary - 500000) * 0.20;
                } else { // salary > 1000000
                    tax = (500000 - 250000) * 0.05 + (1000000 - 500000) * 0.20 + (salary - 1000000) * 0.30;
                }
                break;

            case 2: // New Tax Regime
                if (salary <= 250000) {
                    tax = 0;
                } else if (salary <= 500000) {
                    tax = (salary - 250000) * 0.05;
                } else if (salary <= 750000) {
                    tax = (500000 - 250000) * 0.05 + (salary - 500000) * 0.10;
                } else if (salary <= 1000000) {
                    tax = (500000 - 250000) * 0.05 + (750000 - 500000) * 0.10 + (salary - 750000) * 0.15;
                } else if (salary <= 1250000) {
                    tax = (500000 - 250000) * 0.05 + (750000 - 500000) * 0.10 +
                            (1000000 - 750000) * 0.15 + (salary - 1000000) * 0.20;
                } else if (salary <= 1500000) {
                    tax = (500000 - 250000) * 0.05 + (750000 - 500000) * 0.10 +
                            (1000000 - 750000) * 0.15 + (1250000 - 1000000) * 0.20 +
                            (salary - 1250000) * 0.25;
                } else { // salary > 1500000
                    tax = (500000 - 250000) * 0.05 + (750000 - 500000) * 0.10 +
                            (1000000 - 750000) * 0.15 + (1250000 - 1000000) * 0.20 +
                            (1500000 - 1250000) * 0.25 + (salary - 1500000) * 0.30;
                }
                break;

            default:
                System.out.println("Invalid choice!");
                return; // exit program
        }
        System.out.println("Tax calculated is: ");
        System.out.println(tax);
    }
}
