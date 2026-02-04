package JavaProblemsweek1;

import java.io.File;
import java.util.Scanner;

public class ProductApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c = 0;
        try (Scanner fs = new Scanner(new File("C:\\Users\\Coditas-Admin\\IdeaProjects\\Practice\\src\\main\\resources\\products.txt"))) {
            while (fs.hasNextLine()) {
                fs.nextLine(); // consume line
                c++;
            }
        } catch (Exception e) {
            System.out.println("File not found");
            return;
        }

        Product[] product = new Product[c];
        int index = 0;
        try (Scanner fs = new Scanner(new File("C:\\Users\\Coditas-Admin\\IdeaProjects\\Practice\\src\\main\\resources\\products.txt"))) {
            while (fs.hasNext()) {
                int id = fs.nextInt();
                String name = fs.next();
                double price = fs.nextDouble();
                double gst = fs.nextDouble();
                int qty = fs.nextInt();
                product[index++] = new Product(id, name, price, gst, qty);
            }
        } catch (Exception e) {
            System.out.println("Error reading file");
            return;
        }

        double grandtotal = 0;

        while (true) {
            System.out.println("\nAvailable Products:");
            for (Product p : product) {
                System.out.println(p.id + " " + p.name + " | Rs " + p.price + " | GST " + p.gst + "% | Stock " + p.availableQuantity);
            }
            System.out.println("Enter Product ID (0 for checkout): ");
            int choice = sc.nextInt();

            if (choice == 0)
                break;

            Product selected = null;
            for (Product p : product) {
                if (p.id == choice) {
                    selected = p;
                    break;
                }
            }
            if (selected == null) {
                System.out.println("Invalid product ID");
                continue;
            }
            System.out.println("Enter quantity: ");
            int q = sc.nextInt();
            if (q > selected.availableQuantity) {
                System.out.println("Insufficient Stock!");
                continue;
            }
            double amount = selected.calculateAmount(q);
            grandtotal += amount;
            selected.availableQuantity -= q;
            System.out.println("Added to cart. Amount with GST: Rs " + amount);
        }

        System.out.println("\nCheckout Complete");
        System.out.println("Total Amount Payable (including GST): Rs " + grandtotal);
    }
}
