package application;
import java.util.Scanner;
import java.util.Locale;
import entities.Product;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);


        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();
        Product product = new Product(name, price, quantity);

        int op;

        do {
            System.out.println("\n----MENU----");
            System.out.println("1. Add Products");
            System.out.println("2. Remove Products");
            System.out.println("3. Look up Products");
            System.out.println("4. Exit the program");
            System.out.print("Choose one option: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Enter the number of products to be added in stock: ");
                    quantity = sc.nextInt();
                    product.addProducts(quantity);
                    System.out.println("Product " + product.toString());
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Enter the number of products to be removed from stock: ");
                    quantity = sc.nextInt();
                    product.removeProducts(quantity);
                    System.out.println("Product " + product.toString());
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Product " + product.toString());
                    break;
                case 4:
                    System.out.println("Exit...");
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        } while (op != 4);
        sc.close();
    }
}